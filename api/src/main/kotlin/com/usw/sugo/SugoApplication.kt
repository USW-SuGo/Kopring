package com.usw.sugo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SugoApplication

fun main(args: Array<String>) {
    runApplication<SugoApplication>(*args)
}
