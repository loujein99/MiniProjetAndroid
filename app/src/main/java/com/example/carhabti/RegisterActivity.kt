package com.example.carhabti


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    private lateinit var Registername : TextInputEditText
    private lateinit var emailRegister : TextInputEditText
    private lateinit var pwdRegister : TextInputEditText
    private lateinit var btnRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        Registername=findViewById(R.id.nameRegister)
        pwdRegister=findViewById(R.id.passwordRegister)
        emailRegister=findViewById(R.id.RegisterEmail)
        btnRegister=findViewById(R.id.buttonRegister)

        btnLogRegister.setOnClickListener {
            onBackPressed()
        }
        btnRegister.setOnClickListener {
            val RegisterEmail = emailRegister.text.toString().trim()
            val passwordRegister = pwdRegister.text.toString().trim()
            val Registername = nameRegister.text.toString().trim()
            if (Registername.isEmpty()){
                nameRegister.error="Name Required"
                return@setOnClickListener
            }else if(RegisterEmail.isEmpty()){
                emailRegister.error="Email Required "
                return@setOnClickListener
            }else if (passwordRegister.isEmpty()){
                pwdRegister.error="Password Required"
                return@setOnClickListener
            }else{
                Toast.makeText(this,"Validation Completed",Toast.LENGTH_SHORT).show()

            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left,R.anim.slide_to_right)
    }


}
