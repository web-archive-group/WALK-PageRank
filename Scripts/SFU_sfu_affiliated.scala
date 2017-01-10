import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/SFU_sfu_affiliated/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/SFU_sfu_affiliated-nodes", "/data/derivatives/pagerank/SFU_sfu_affiliated-links")
exit
