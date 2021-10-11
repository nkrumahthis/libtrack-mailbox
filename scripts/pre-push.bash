#!/bin/bash
echo “Running pre-push hook”
echo “run linter:”
mvn checkstyle:check
if [ $? -ne 0 ]; then
 echo “warning: lint build failed.”
fi
echo “run tests:”
mvn clean test
if [ $? -ne 0 ]; then
 echo “Tests must pass before commit!”
 exit 1
fi