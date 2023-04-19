package br.com.theodoro.chatapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    lateinit var btnPrevious: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnPrevious = findViewById(R.id.btnPrevious)

        btnPrevious.setOnClickListener {
            intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }
    }
}