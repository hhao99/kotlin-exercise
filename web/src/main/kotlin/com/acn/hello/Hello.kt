package com.acn.hello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HelloApp {
    private val log = LoggerFactory.getLogger(HelloApp::class.java)

    @Bean
    fun init() = CommandLineRunner {
        log.info("Hello World")

    }
}

fun main(args: Array<String>) {
    runApplication<HelloApp>(*args)

}