package example.issue

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class MyProblem(service: MyService) {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(MyProblem::class.java)
    }

    init {
        service.register(object : MyServiceListener {
            override fun helloCalled() {
                logger.info("Observer hello called")
            }
        })
    }
}