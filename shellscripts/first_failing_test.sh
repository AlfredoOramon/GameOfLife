#!/bin/sh
. ./returnGameName.sh
git add ../*
git commit -m "KATA-$KATANAME - Implementing failing test $1"
#echo "KATA-$KATANAME - Implementing failing test $1"
