package com.example.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 21, "プログラミング")
        val human2 = Human("山田", 22, "音楽")

        val humans = arrayOf(human1, human2)

        for (human in humans) {
            human.say()
            human.think()
        }

    }
}