package com.wrkteam.quadclubapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.wrkteam.quadclubapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.btnToLogin.setOnClickListener {
            loginUser()
        }

        binding.btnToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java).apply {}
            startActivity(intent)
        }
    }

    private fun loginUser() {
        val email: String = binding.txtLogEmail.text.toString()
        val password: String = binding.txtLogPassword.text.toString()

        if(email == "")
        {
            Toast.makeText(this@LoginActivity, "Wypełnij pole email", Toast.LENGTH_LONG).show()
        }
        else if (password == "")
        {
            Toast.makeText(this@LoginActivity, "Wypełnij pole hasło", Toast.LENGTH_LONG).show()
        }
        else
        {
            mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this) { task ->
                    if(task.isSuccessful)
                    {
                        Toast.makeText(this@LoginActivity, "zalogowano", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, MainActivity::class.java).apply {}
                        startActivity(intent)
                    }
                    else
                    {
                        Toast.makeText(this@LoginActivity, "Błąd: złe dane !", Toast.LENGTH_LONG).show()
                    }
                }
        }
    }
}