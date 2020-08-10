package com .intothebasket.groovy.asserts
import groovy.test.*

class AssertsDemo{

    static void main(String[] args){
        //Groovy Version of Method Reference
        assert tesMultiply(AssertsDemo.&multiply)
    }
    static List tesMe(Closure c){
        (2..10).findAll{ c(it) == it*2 } 
    }

    static boolean tesMultiply(Closure c){
        (2..10).findAll{ c(it) == it*2 } == [2,3,4,5,6,7,8,9,10]
    }

    static int multiply(int x){
        x *2
    }

}


