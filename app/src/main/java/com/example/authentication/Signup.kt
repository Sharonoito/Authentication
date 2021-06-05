package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class Signup : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender:Spinner
    lateinit var etEmail2: EditText
    lateinit var etPhonenumber:EditText
    lateinit var etPassword2: EditText
    lateinit var btnSignup2: Button
    lateinit var btnLogin2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castViews()
        signup()
        login()

    }
    fun castViews(){
        etName=findViewById(R.id.etName)
        spGender=findViewById(R.id.spGender)
        etEmail2=findViewById(R.id.etEmail2)
        etPhonenumber=findViewById(R.id.etPhonumber)
        etPassword2=findViewById(R.id.etPassword2)
        btnSignup2=findViewById(R.id.btnSignup2)
        btnLogin2=findViewById(R.id.btnLogin2)

        val gender = arrayOf("Male","Female","Other")
        val adapter =
            ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter
        signup()
        login()


    }
    fun signup(){
        btnSignup2.setOnClickListener {
            val intent= Intent(baseContext,Signup::class.java)
            startActivity(intent)
        }
    }
    fun login(){
        btnLogin2.setOnClickListener {
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}