package com.example.kotlindicegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun dice(view: View) {
        val counterArr = arrayOf(-1,0,0,0,0,0,0)
        val newDice:Int = Random.nextInt(0, 7)

        for(i:Int in 1..1_000_000){
            counterArr[newDice]++
        }

       for(i:Int in 1..counterArr.size-1)
           println("My Dice | $i is ${counterArr[i]}")
    }
}