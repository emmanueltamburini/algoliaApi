var path = require('path');
var webpack = require('webpack');

module.exports = (env, mode = "") => ({
    entry: ['./src/main/js/index.js'],
    mode: mode,
    output: {
        path: __dirname,
        filename: './target/classes/static/built/bundle.js'
    },
    resolve: {
        alias: {
            teraplug: path.resolve('src/main/js'),
            react: path.resolve(__dirname, 'node_modules/react'),
            'react-dom': path.resolve(__dirname, 'node_modules/react-dom'),
        }
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                include: path.resolve(__dirname, 'src'),
                loader: "babel-loader",
                options: {
                    cacheDirectory: true
                }
            }
        ]
    },
    plugins: [
        new webpack.DefinePlugin({
            'env': {
                'VERSION': JSON.stringify(env && env.version ? env.version : '0-SNAPSHOT'),
                'MODE': JSON.stringify(mode)
            }
        })
    ]
});
