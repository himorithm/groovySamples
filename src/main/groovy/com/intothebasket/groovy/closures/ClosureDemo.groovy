package com.intothebasket.groovy.closures

class ClosureDemo {

    static void main(String[] args) {
        def closure1 = { println "Closre with default Pram $it" }
        def closure2 = { -> println " Closure with No param Accepted" }
        def closure3 = { name -> println "Closure With Single Named Param $name" }
        def closure4 = { name, city -> println "Closure With Two Pram $name and $city" }

        closure1 "Rakesh"
        closure2()  // Brackets  are mandatory
        closure3 "Ameya"
        closure4 "Raje", "Thane"

        sampleMethod("Heri") { println "Anonimous Closure Param Outside : $it" }
        sampleMethod("Hari", { println "Anonimus Closure Prama: $it " })
        sampleMethod("Hari", closure1)
        sampleMethod("Hari", closure3)
        
        def curryMethod = { n,c -> sampleMethod(n,c)}

        def onecurry =  curryMethod.curry("FixedName")

        onecurry({closure1})

        //Wrap simple method as closure .. Woow
        multiPrint(ClosureDemo.&myPrintln)

    }

    static void multiPrint(Closure clo){
        (2..5).each{ clo(it) }
    }

    static void myPrintln( msg){
        println "Myprintln $msg"
    }

    static void sampleMethod(String name, Closure closure) {
        closure(name)
    }
}
