package example.issue

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("example.issue")
                .mainClass(Application.javaClass)
                .start()
    }
}