package com.intothebasket.groovy.curry

import java.time.LocalDateTime

class CurryDemo {

    static void main(String[] args) {

        log(LocalDateTime.now(), "INFO", "Simple Logging")
        def noPramCurry = { LocalDateTime x, String y, String z -> log(x, y, z) }

        def onePramCurry = noPramCurry.curry(LocalDateTime.now())

        onePramCurry("INFO", "One Pram Curry Example")

        def twoPramCurry = onePramCurry.curry("INFO")

        twoPramCurry("Two Pram Curry")

        def twoPramOtherOption = noPramCurry.curry(LocalDateTime.now(), "DEBUG")

        twoPramOtherOption("Two Pram Curry Again ")


        def uselessLog = noPramCurry.rcurry("Log will print same message")
        uselessLog(LocalDateTime.now(), "INFO")
        sleep(1000L)
        uselessLog(LocalDateTime.now(), "INFO")


    }


    static void log(LocalDateTime ldt, String level, String msg) {
        println "$ldt:$level:$msg"
    }
}
