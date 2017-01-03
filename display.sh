#!/usr/bin/env bash
cp ./data/$1.json ./data/graph.json
python -m http.server 4321