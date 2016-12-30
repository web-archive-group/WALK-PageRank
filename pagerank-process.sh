#!/usr/bin/env bash
# USAGE: sh warcbase-process.sh COLLECTIONNAME
# i.e. sh warcbase-process.sh WAHR_ymmfire

# create the new scala script to run
sed -e "s/\${COLLECTION}/$1/g" pagerank-template.scala > $1.scala

# execute in Spark Shell
/home/ubuntu/project/spark-1.6.1-bin-hadoop2.6/bin/spark-shell -i /home/ubuntu/WALK-PageRank/$1.scala --driver-memory 45G --jars /home/ubuntu/project/warcbase/warcbase-core/target/warcbase-core-0.1.0-SNAPSHOT-fatjar.jar | tee /home/ubuntu/WALK-PageRank/$1-pagerank.log

# clean up
cat /data/derivatives/pagerank/$1-links/part* > $1-links.txt
mv $1-links.txt /data/derivatives/pagerank
cat /data/derivatives/pagerank/$1-nodes/part* > $1-nodes.txt
mv $1-nodes.txt /data/derivatives/pagerank

# jq
jq -c -n --slurpfile nodes </data/derivatives/pagerank/$1-links.txt --slurpfile links \
  </data/derivatives/pagerank/$1-nodes.txt '{nodes: $nodes, links: $links}' > $1-graph.json