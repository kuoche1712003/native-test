package io.kuoche

import io.quarkus.mongodb.panache.kotlin.reactive.ReactivePanacheMongoRepository
import jakarta.enterprise.context.ApplicationScoped

@ApplicationScoped
class TestDAO : ReactivePanacheMongoRepository<TestPO>