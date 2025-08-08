val exposed_version: String by project
val h2_version: String by project
val kotlin_version: String by project
val logback_version: String by project
val postgres_version: String by project
val log4j_version : String by project
val kotlin_logging_version : String by project
val coroutines_version : String by project

plugins {
    kotlin("jvm") version "2.1.10"
    id("io.ktor.plugin") version "3.1.3"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.1.10"
}

group = "com.example"
version = "0.0.1"

application {
    mainClass.set("com.example.ApplicationKt")
}
ktor {
    fatJar {
        archiveFileName.set("fat.jar")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-openapi")
    implementation("io.ktor:ktor-server-auth")
    implementation("io.ktor:ktor-server-auth-jwt")
    implementation("io.ktor:ktor-server-call-logging")
    implementation("io.ktor:ktor-server-call-id-jvm")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-serialization-kotlinx-json")
    implementation("io.ktor:ktor-serialization-gson")
    implementation("org.jetbrains.exposed:exposed-core:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-dao:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposed_version")
    implementation("org.jetbrains.exposed:exposed-java-time:$exposed_version")
    implementation("com.h2database:h2:$h2_version")
    implementation("org.postgresql:postgresql:$postgres_version")
    implementation("io.ktor:ktor-server-request-validation")
    implementation("io.ktor:ktor-server-auto-head-response")
    implementation("io.ktor:ktor-server-netty")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    //password Encryption
    implementation("org.mindrot:jbcrypt:0.4")
    // Logging
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:${log4j_version}")
    implementation("org.apache.logging.log4j:log4j-api:${log4j_version}")
    implementation("org.apache.logging.log4j:log4j-core:${log4j_version}")
    implementation("io.github.microutils:kotlin-logging-jvm:${kotlin_logging_version}")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:${coroutines_version}")
    implementation("io.ktor:ktor-server-config-yaml")
    implementation("io.ktor:ktor-server-cors:3.1.3")
    implementation("io.ktor:ktor-server-call-id:3.1.3")
    // Email
    implementation("org.apache.commons:commons-email:1.5")
    testImplementation("io.ktor:ktor-server-test-host")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
