package com.intothebasket.groovy.permutations

/***
 * Permutation and combination on Simple Arrays using Groovy features
 */
class PermutationsDemo {

    static void main(String[] args) {

        Set combinations = [['a', 'b', 'c'], ['x', 'y'], ['m', 'n']].combinations()
        println "All Possible Combinations are $combinations"
        Set permutations = ['a', 'b', 'c'].permutations()
        println "All possible permutations are $permutations"

        [['a', 'b', 'c'], ['x', 'y']].eachCombination { println it }
        [['a', 'b', 'c'], ['x', 'y']].eachPermutation { println it }


        List transPose = [['a', 'b', 'c'], ['x', 'y', 'z'], ['m', 'n', 'o']].transpose()
        println "Transpose i.e. conver Row to Collumn $transPose"


    }
}
