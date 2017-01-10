import org.warcbase.spark.matchbox._
import org.warcbase.spark.rdd.RecordRDD._
import org.warcbase.spark.matchbox.RecordLoader
import org.warcbase.spark.matchbox.ExtractGraph

val recs=RecordLoader.loadArchives("/data/TORONTO_federal_election_candidate_sites_2015/*.gz", sc)
val graph = ExtractGraph(recs, dynamic=false, numIter = 15)
graph.writeAsJson("/data/derivatives/pagerank/TORONTO_federal_election_candidate_sites_2015-nodes", "/data/derivatives/pagerank/TORONTO_federal_election_candidate_sites_2015-links")
exit
