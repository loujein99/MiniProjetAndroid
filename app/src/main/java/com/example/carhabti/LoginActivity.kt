package com.example.carhabti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var emailLogin : TextInputEditText
    private lateinit var pwdLogin : TextInputEditText
    private lateinit var btnlogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailLogin=findViewById(R.id.loginEmail)
        pwdLogin=findViewById(R.id.passwordLogin)
        btnlogin=findViewById(R.id.button)

        btnRegLogin.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)
        }
        btnlogin.setOnClickListener{
            val loginEmail=emailLogin.text.toString().trim()
            val passwordLogin=pwdLogin.text.toString().trim()
            if (loginEmail.isEmpty()){
                emailLogin.error="Email Required"
                return@setOnClickListener
            }else if (passwordLogin.isEmpty())
            {
                pwdLogin.error="Password Required"
                return@setOnClickListener
            }
            else {
                Toast.makeText(this,"Validation Completed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
