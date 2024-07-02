package io.kuoche

import io.quarkus.mongodb.panache.common.MongoEntity
import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty

@MongoEntity(collection = "test")
data class TestPO @BsonCreator constructor(
    @BsonProperty("name") @get:BsonProperty("name") val apple: String,
    @BsonProperty("count") @get:BsonProperty("count") val count: Int
)
