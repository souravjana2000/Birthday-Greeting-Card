package com.example.sourav

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val Name_Extra = "name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
         val name = intent.getStringExtra(Name_Extra)
        BirthdayGreeting.text = "Happy Birthday \n$name!\n"
    }
}