package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etPassword:EditText
    lateinit var btnSignUp: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        view()
        click()
    }
    fun view(){
        etName=findViewById(R.id.etName3)
        etPassword=findViewById(R.id.etPassword1)
        btnSignUp=findViewById(R.id.btnSignUp2)
    }
    fun click(){
        btnSignUp.setOnClickListener {
            val intent=Intent(baseContext,SignUp::class.java)
            startActivity(intent)
        }
    }
}