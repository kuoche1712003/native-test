package io.kuoche

import com.fasterxml.jackson.annotation.JsonProperty

data class Test(
    @field:JsonProperty("apple")
    val name: String,
    val times: Int,
)
