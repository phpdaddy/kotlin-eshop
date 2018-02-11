package com.phpdaddy.kotlineshop

import kotlinx.html.div
import kotlinx.html.dom.append
import kotlin.browser.document

fun main(args: Array<String>) {
    com.phpdaddy.common.require("style.scss")

    document.getElementById("content")!!.append {
        div() {
            +"Hello KotlinEshop"
        }
    }
}