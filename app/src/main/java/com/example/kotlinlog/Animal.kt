package com.example.kotlinlog

abstract class Animal {
    protected var name: String
    protected var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}