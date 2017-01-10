import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/UVIC_environmental_organizations_and_resources_of_bc/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/UVIC_environmental_organizations_and_resources_of_bc-nodes", "/data/derivatives/pagerank/UVIC_environmental_organizations_and_resources_of_bc-links")
exit
