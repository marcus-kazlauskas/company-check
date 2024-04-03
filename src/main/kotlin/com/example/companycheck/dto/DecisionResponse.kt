package com.example.companycheck.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class DecisionResponse(
    val decision: Boolean,
    val details: List<String>
) {
}