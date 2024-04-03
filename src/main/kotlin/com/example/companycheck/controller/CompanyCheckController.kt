package com.example.companycheck.controller

import com.example.companycheck.dto.CompanyCheckRequest
import com.example.companycheck.dto.DecisionResponse
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/company")
class CompanyCheckController {

    @PostMapping(value = ["/check"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun checkCompany(
        @RequestBody request: CompanyCheckRequest
    ): DecisionResponse {
        return DecisionResponse(false, listOf("Проверка"))
    }
}