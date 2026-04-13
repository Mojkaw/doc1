#!/bin/sh
# use a subshel $() to execute a shell command
now=$(date)
echo "Current date: $now"
echo $(uname -o)
echo "DevOps Rocks!"
