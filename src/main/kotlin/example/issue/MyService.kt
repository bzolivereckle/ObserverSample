package example.issue

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class MyService {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(MyService::class.java)
    }

    private val listeners = mutableSetOf<MyServiceListener>()

    fun register(listener: MyServiceListener) {
        listeners.add(listener)
    }

    fun unregister(listener: MyServiceListener) {
        listeners.remove(listener)
    }

    fun helloWorld(): String {
        logger.info("Service hello called")
        listeners.forEach { it.helloCalled() }
        return "Hello World"
    }

}