package com.example.safifees_v0.ui.forgetPassword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.safifees_v0.ui.login.LoginActivity
import com.example.safifees_v0.R
class ForgetPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pasword)

        val button_sendTicket = findViewById<Button>(R.id.button_sendTicket)
        val imageView_return = findViewById<ImageView>(R.id.imageView_return)

        button_sendTicket.setOnClickListener {
            Toast.makeText(this, "TODO !", Toast.LENGTH_SHORT).show()
        }

        imageView_return.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent);
        }

    }
}

open class AppCompatActivity {
}
