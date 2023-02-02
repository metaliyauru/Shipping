package com.app.shipping

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class LogInActivity : AppCompatActivity() {

    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var btnLogIn: Button
    private val sharedPrefFile = "ShippingLogIn"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)


        findId()
        click()


        val sharedPreferences: SharedPreferences =
            this.getSharedPreferences(
                sharedPrefFile,
                Context.MODE_PRIVATE
            )

        val loginn = sharedPreferences.getString("login", "").toString()

        if (loginn == "yes") {

            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)

        }


    }

    private fun click() {
        btnLogIn.setOnClickListener {

            val email = "user@gmail.com"
            val password = "user123"
            /*  if (edtEmail.length() == 0) {
                  edtEmail.error = "Please Enter Email"
              } else if (edtPassword.length() == 0)
              else {

                  val password = edtPassword.text.toString()

              }
  */

            val emaill = edtEmail.text.toString()
            val passwordd = edtPassword.text.toString()


            if (emaill == email && passwordd == password) {

                Toast.makeText(this@LogInActivity, "Login Successfully", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@LogInActivity, HomeActivity::class.java)
                startActivity(intent)


            } else {
                Toast.makeText(this@LogInActivity, "Login Failed", Toast.LENGTH_SHORT).show()
            }


        }
    }

    private fun findId() {
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogIn = findViewById(R.id.btnLogIn)
    }
}