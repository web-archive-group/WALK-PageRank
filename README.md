# WALK-PageRank

This repository modifies WALK templates in order to run PageRank on collections. Dynamic PageRank is probably too intensive, so for at least a beginning point we will run 15 iterations per collection.

## Visualizing Them

1. Clone the repository
2. In the `/link-vis` directory, you can run the following shell script if you have Python 3.

`./display.sh <collection>`

Where collection is one of:

```
ALBERTA_alberta_education_curriculum-graph
ALBERTA_alberta_floods_2013-graph
ALBERTA_alberta_oil_sands-graph
ALBERTA_canadian_business_grey_literature-graph
ALBERTA_edmonton_public_library-graph
ALBERTA_energy_environment-graph
ALBERTA_fort_mcmurray_wildfire_2016-graph
ALBERTA_government_information-graph
ALBERTA_hcf_alberta_online_encyclopedia-graph
ALBERTA_health_sciences_grey_literature-graph
ALBERTA_heritage_community_foundation-graph
ALBERTA_humanities_computing-graph```

i.e. `./display.sh ALBERTA_alberta_floods_2013-graph`

Graph will be on <http://localhost:4321>.

## Next Step

Making these legible. :)