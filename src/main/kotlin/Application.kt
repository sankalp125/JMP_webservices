package com.example

import com.example.module.DatabaseFactory
import com.example.module.configureHttp
import com.example.module.configureMonitoring
import com.example.module.configureSecurity
import com.example.module.configureSerialization
import com.example.module.scheduleJobs
import com.example.plugins.configureRouting
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    // handle everything from here
    DatabaseFactory.init()
    configureSecurity()
    configureHttp()
    configureMonitoring()
    configureSerialization()
    configureRouting()
    handleServerClosing()
    scheduleJobs()
}
fun Application.handleServerClosing(){
    environment.monitor.subscribe(ApplicationStopping){application ->
        application.environment.log.info("Server is Closing")
        DatabaseFactory.closeDatabaseConnection()
    }
}
