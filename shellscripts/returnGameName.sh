#!/bin/sh
line=$(head -n 1 ../README.md)

FOO=$line
KATANAME="$(echo "${FOO}" | tr -d '[:space:]')"
export KATANAME