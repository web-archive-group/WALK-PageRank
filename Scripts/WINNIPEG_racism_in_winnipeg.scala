import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/WINNIPEG_racism_in_winnipeg/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/WINNIPEG_racism_in_winnipeg-nodes", "/data/derivatives/pagerank/WINNIPEG_racism_in_winnipeg-links")
exit
