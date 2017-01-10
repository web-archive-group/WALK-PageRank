import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/TORONTO_toronto_2015_pan_am_parapan_american_games/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/TORONTO_toronto_2015_pan_am_parapan_american_games-nodes", "/data/derivatives/pagerank/TORONTO_toronto_2015_pan_am_parapan_american_games-links")
exit
