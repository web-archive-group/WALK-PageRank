import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/UVIC_University_of_Victoria_50th_Anniversary_1963-2013/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/UVIC_University_of_Victoria_50th_Anniversary_1963-2013-nodes", "/data/derivatives/pagerank/UVIC_University_of_Victoria_50th_Anniversary_1963-2013-links")
exit
