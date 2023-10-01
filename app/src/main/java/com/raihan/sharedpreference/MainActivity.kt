package com.raihan.sharedpreference

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raihan.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      /*  val dataShow = getSharedPreferences("SAVE", Context.MODE_PRIVATE)
        binding.email.setText(dataShow.getString("email", null))
        binding.password.setText(dataShow.getString("password", null))*/


        binding.savebtn.setOnClickListener {

            val editor = getSharedPreferences("SAVE", Context.MODE_PRIVATE).edit()

            editor.putString("email", binding.email.text.toString())
            editor.putString("password", binding.password.text.toString())
            editor.apply()
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,DataActivity::class.java))
        }


    }
}