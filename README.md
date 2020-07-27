# spring-cloud-contracts-consumer-approach2
Spring Cloud Contracts Consumer App - Approach 2 - 

When there are NO contracts available on the external service or NO stubs uploaded in the artifactory, 
then the contracts and stubs can be written in the consumer app itself in a separate module which can then be used to write implementation tests.

This app consumes the service from repo (spring-cloud-contract-tests-producer) and assuming the producer app did not have any contracts written, 
this consumer app generates it own for the service it consumes.

