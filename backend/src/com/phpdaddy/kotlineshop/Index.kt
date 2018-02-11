package com.phpdaddy.kotlineshop

import kotlinx.html.HTML
import kotlinx.html.body
import kotlinx.html.h1
import org.jetbrains.ktor.application.*
import org.jetbrains.ktor.html.*
import org.jetbrains.ktor.http.*
import org.jetbrains.ktor.locations.*
import org.jetbrains.ktor.response.*
import org.jetbrains.ktor.routing.*
import org.jetbrains.ktor.sessions.*
import java.time.*

fun Route.index() {
    contentType(ContentType.Text.Html) {
        get<Index> {
            call.respondHtmlTemplate(object : Template<HTML> {
                override fun HTML.apply() {
                    body {
                        h1("Hello")
                    }
                }

            }) {
            }
        }
    }
}
