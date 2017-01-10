import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/UVIC_bc_teachers_labour_dispute_2014/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/UVIC_bc_teachers_labour_dispute_2014-nodes", "/data/derivatives/pagerank/UVIC_bc_teachers_labour_dispute_2014-links")
exit
