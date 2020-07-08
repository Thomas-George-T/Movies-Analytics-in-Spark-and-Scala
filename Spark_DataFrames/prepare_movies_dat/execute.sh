#!/usr/bin/env bash
##################################################
# Purpose : Automate Testing
# Author  : Thomas George Thomas
##################################################

echo "Opening spark shell"
spark-shell -i prepare_movies.scala
