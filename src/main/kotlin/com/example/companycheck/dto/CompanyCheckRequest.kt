package com.example.companycheck.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class CompanyCheckRequest(
    val inn: String,
    val region: String,
    val capital: Long
) {
}