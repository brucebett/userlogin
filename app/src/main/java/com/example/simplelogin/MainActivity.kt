package com.example.simplelogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mail_edt:EditText
    lateinit var pass_edt:EditText
    lateinit var login_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mail_edt = findViewById(R.id.edt_email)
        pass_edt = findViewById(R.id.edt_password)
        login_btn = findViewById(R.id.btn_login)

        login_btn.setOnClickListener {

            // grab user info
        var email = mail_edt.text.toString().trim()
        var password = pass_edt.text.toString().trim()

        //validate
         if (email.isEmpty() || password.isEmpty()) {

             Toast.makeText(this, "Cannot submit an empty form", Toast.LENGTH_SHORT).show()

         } else {

             if (email == "bett@gmail.com" && password == "admin123") {

                 Toast.makeText(this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show()
             //navigate to another page
             var intent = Intent(this, Dashboard::class.java)
             startActivity(intent)

         } else {

                 Toast.makeText(this, "Wrong password.Try again", Toast.LENGTH_SHORT).show()

         }

             }


        }
    }
}