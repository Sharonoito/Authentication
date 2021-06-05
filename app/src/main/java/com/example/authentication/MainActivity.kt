package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword:EditText
    lateinit var btnLogin:Button
    lateinit var btnSignup:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        login()
        signup()

}
    fun castViews(){
        etEmail=findViewById(R.id.etName)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        btnSignup=findViewById(R.id.btnSignup)
    }
    fun login(){
        btnLogin.setOnClickListener {
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun signup(){
        btnSignup.setOnClickListener {
            val intent=Intent(baseContext,Signup::class.java)
            startActivity(intent)
        }
    }
}