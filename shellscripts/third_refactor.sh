#!/bin/sh
. ./returnGameName.sh
git add ../*
git commit -m "KATA - $KATANAME - Refactoring $1"