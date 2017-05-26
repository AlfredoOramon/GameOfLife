#!/bin/sh
. ./returnGameName.sh
git add ../*
git commit -m "KATA-$KATANAME - Implementing easiest test $1"
