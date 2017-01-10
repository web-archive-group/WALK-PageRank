import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/WINNIPEG_truth_reconciliation/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/WINNIPEG_truth_reconciliation-nodes", "/data/derivatives/pagerank/WINNIPEG_truth_reconciliation-links")
exit
