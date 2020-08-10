package com.intothebasket.groovy.memonize

import java.time.Duration
import java.time.Instant

class MemoizeDemo {

    static void main(String[] args) {

        def complexCal = { x, y ->
            sleep(1000L)
            x * y
        }.memoize()


        def then = Instant.now()
        println complexCal(1, 2)
        println "First call is slower, completed in : ${Duration.between(then, Instant.now()).toMillis()} ms"
        then = Instant.now()
        println complexCal(1, 2)
        println "Cached Call is faster, completed in: ${Duration.between(then, Instant.now()).toMillis()} ms"
    }

}
