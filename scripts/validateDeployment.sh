#!/bin/sh

DEPLOYMENT_NAME=$1

kubectl rollout restart deployment "$DEPLOYMENT_NAME"
if ! kubectl rollout status deployment "$DEPLOYMENT_NAME"; then
    echo "Rolling back deployment!" >&2
    kubectl rollout undo deployment "$DEPLOYMENT_NAME"
    kubectl rollout status deployment "$DEPLOYMENT_NAME"
    exit 1
fi