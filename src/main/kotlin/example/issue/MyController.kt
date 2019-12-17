package example.issue

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class MyController(private val service: MyService) {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun helloWorld() = service.helloWorld()
}