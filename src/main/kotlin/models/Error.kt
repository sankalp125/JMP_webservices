package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ErrorResponse(
    val error : String
)