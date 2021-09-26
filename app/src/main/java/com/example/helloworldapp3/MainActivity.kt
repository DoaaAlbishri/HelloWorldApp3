package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textsum : TextView
    lateinit var textsub : TextView
    lateinit var textmulti : TextView

    lateinit var mytext : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textsum= findViewById(R.id.textsum)
        textsub= findViewById(R.id.textsub)
        textmulti= findViewById(R.id.textmulti)

        mytext= findViewById(R.id.textView2)

        var sum = findViewById<Button>(R.id.btnSum)
        var sub = findViewById<Button>(R.id.btnSub)
        var multi = findViewById<Button>(R.id.btnMulti)

        var num1 = 5
        var num2 = 10


        sum.setOnClickListener {
            var i =  sum(num1,num2)
            textsum.text = "$i"
        }

        sub.setOnClickListener {
            var i = sub(num1,num2)
            textsub.text = "$i"
        }

        multi.setOnClickListener {
            var i = multi(num1,num2)
            textmulti.text = "$i"
        }

        mytext.setText("Thank you!")

    }
    fun sub (num1 : Int , num2 : Int) : Int {
        return num2-num1
    }
    fun sum (num1 : Int , num2 : Int) : Int {
        return num1+num2
    }
    fun multi (num1 : Int , num2 : Int) : Int {
        return num1+num2
    }
}