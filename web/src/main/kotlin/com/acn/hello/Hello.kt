package com.acn.hello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
class HelloApp {
    private val log = LoggerFactory.getLogger(HelloApp::class.java)

    @Bean
    fun init() = CommandLineRunner {
        log.info("HelloApp Start, open http://localhost:8080 see the welcome message")

    }
}

fun main(args: Array<String>) {
    runApplication<HelloApp>(*args)

}