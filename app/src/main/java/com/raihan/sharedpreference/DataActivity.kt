package com.raihan.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raihan.sharedpreference.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dataShow = getSharedPreferences("SAVE", Context.MODE_PRIVATE)
        binding.emailtxt.text=(dataShow.getString("email", null))
        binding.passwordtxt.text=(dataShow.getString("password", null))


    }
}