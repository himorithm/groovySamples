package com.intothebasket.groovy.http

class DownloadUrl {
    static void main(String[] args) {
        def pageText = "http://example.com/".toURL().text
        println pageText
    }
}
