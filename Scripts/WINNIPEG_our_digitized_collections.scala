import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/WINNIPEG_our_digitized_collections/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/WINNIPEG_our_digitized_collections-nodes", "/data/derivatives/pagerank/WINNIPEG_our_digitized_collections-links")
exit
