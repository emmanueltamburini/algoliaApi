package com.angoliaapi.controller;

import static com.angoliaapi.constants.Constants.*;
import static com.angoliaapi.constants.URLConstants.API_URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    @Value(URL)
    private String url;

    @GetMapping(API_URL)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getUrlInfo(@RequestParam(required = false) String query) {
        logger.info("Called resource: getUrlInfo");
        Map<String, Object> response = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder content = new StringBuilder();
        Map<String, Object> apiResponse;
        int status = 500;

        try {
            URL urlGet = UriComponentsBuilder.fromUriString(url).queryParam(QUERY, query).build().toUri().toURL();

            logger.info("Calling to {} ...", url);
            HttpURLConnection con = (HttpURLConnection) urlGet.openConnection();
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);
            logger.info("{} was called successfully", url);

            status = con.getResponseCode();
            response.put(URL_CONSULTED, urlGet.toString());
            response.put(STATUS_URL, status);

            BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            response.put(MESSAGE, SOMETHING_WRONG);
            response.put(CONTENT, e);
            return new ResponseEntity<>(response, HttpStatus.valueOf(status));
        }
        
        try {
            apiResponse = mapper.readValue(content.toString(), new TypeReference<Map<String, Object>>(){});
        } catch (Exception e ) {
            response.put(MESSAGE, SOMETHING_WRONG);
            response.put(CONTENT, e);
            return new ResponseEntity<>(response, HttpStatus.valueOf(status));
        }

        response.put(MESSAGE, RESPONSE_SUCCESSGULLY);
        response.put(CONTENT, apiResponse);

        return new ResponseEntity<>(response, HttpStatus.valueOf(status));
    }
}
