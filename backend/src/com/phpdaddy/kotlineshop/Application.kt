package com.phpdaddy.kotlineshop

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.call
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.features.*
import org.jetbrains.ktor.http.HttpStatusCode
import org.jetbrains.ktor.locations.Locations
import org.jetbrains.ktor.logging.CallLogging
import org.jetbrains.ktor.routing.routing

fun Application.main() {

    install(DefaultHeaders)
    install(CallLogging)
    install(ConditionalHeaders)
    install(PartialContentSupport)
    install(Compression)
    install(Locations)
    install(StatusPages) {
        exception<NotImplementedError> { call.respond(HttpStatusCode.NotImplemented) }
    }

    routing {
        index()
    }
}