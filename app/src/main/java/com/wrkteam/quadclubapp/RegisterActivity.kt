package com.wrkteam.quadclubapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.wrkteam.quadclubapp.databinding.ActivityLoginBinding
import com.wrkteam.quadclubapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.buttonRegister.setOnClickListener {
            registerUser()
        }
    }


    private fun registerUser() {
            val email: String = binding.registerEmail.text.toString()
            val password: String = binding.registerPassword.text.toString()
            val password2: String = binding.registerPasswordRepeat.text.toString()


        if(email == "")
        {
            Toast.makeText(this@RegisterActivity, "Wypełnij pole email", Toast.LENGTH_LONG).show()
        }
        else if (password == "" || password2 == "")
        {
            Toast.makeText(this@RegisterActivity, "Wypełnij pole hasło", Toast.LENGTH_LONG).show()
        }
        else
        {
            if(password == password2) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this@RegisterActivity,
                                "utorzono konto",
                                Toast.LENGTH_LONG
                            ).show()
                            val intent = Intent(this, LoginActivity::class.java).apply {}
                            startActivity(intent)
                        } else {
                            Toast.makeText(this@RegisterActivity, "Error!", Toast.LENGTH_LONG)
                                .show()
                        }
                    }
            } else {
                Toast.makeText(this@RegisterActivity, "Podane hasła różnią się !", Toast.LENGTH_LONG).show()
            }
        }
    }


}