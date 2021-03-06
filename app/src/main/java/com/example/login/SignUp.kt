package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class SignUp : AppCompatActivity() {
    lateinit var etName2:EditText
    lateinit var etEmail3:EditText
    lateinit var etPhoneNumber:EditText
    lateinit var spGender:Spinner
    lateinit var etPassword:EditText
    lateinit var btnLogin2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        views()
        onclick()
    }
    fun views(){
        etName2=findViewById(R.id.etName2)
        etEmail3=findViewById(R.id.etEmail3)
        etPhoneNumber=findViewById(R.id.etPhoneNumber)
        spGender=findViewById(R.id.spGender)
        etPassword=findViewById(R.id.etPassword)
        btnLogin2=findViewById(R.id.btnLogin2)
        var gender = arrayOf("choose gender","Male","Female")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter

    }

    fun onclick(){
        btnLogin2.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}