import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/ALBERTA_canadian_business_grey_literature/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/ALBERTA_canadian_business_grey_literature-nodes", "/data/derivatives/pagerank/ALBERTA_canadian_business_grey_literature-links")
exit
