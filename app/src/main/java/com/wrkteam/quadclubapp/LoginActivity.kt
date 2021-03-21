package com.wrkteam.quadclubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()


        btn_to_login.setOnClickListener {
            loginUser();
        }
    }

    private fun loginUser() {
        val email: String = txt_log_email.text.toString()
    }
}