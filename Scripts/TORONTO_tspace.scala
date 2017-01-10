import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/TORONTO_tspace/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/TORONTO_tspace-nodes", "/data/derivatives/pagerank/TORONTO_tspace-links")
exit
