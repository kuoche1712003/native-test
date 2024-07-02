package io.kuoche

import org.bson.codecs.pojo.annotations.BsonProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation

/**
 * this will get the @get:BsonProperty("value") value or field name
 */
fun <T, R> KProperty1<T, R>.bsonFieldName() =
    this.getter.findAnnotation<BsonProperty>()?.value
        ?: this.name