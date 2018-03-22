package com.acn.Hello
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.PathVariable


@Controller
class HhelloController {
    @RequestMapping("/")
    @ResponseBody
    fun home(): String {
        return "Hello World"
    }

    @RequestMapping("/{name}")
    @ResponseBody
    fun home(@PathVariable("name") name:String): String {
        return "Hello " + name
    }
}
