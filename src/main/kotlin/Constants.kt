package com.example

object Constants {
    //staging
    const val JDBC_URL = "jdbc:postgresql://localhost:5432/jmp_db"
    const val DB_USER = "postgres"
    const val DB_PASSWORD = "123456"
    const val ACCESS_SECRET = "access_token_secret_key"
    const val REFRESH_SECRET = "refresh_token_secret_key"
    const val ISSUER = "issuer"
    const val AUDIENCE = "audience"
    const val ACCESS_TOKEN_VALIDITY_IN_MS = 1_000 * 60 * 60 // 1 hour
    const val REFRESH_TOKEN_VALIDITY_IN_MS = 1_000 * 60 * 60 * 24 * 30L // 30 days
}