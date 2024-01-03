package com.example.sharedpreference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.databinding.ActivityShowDataBinding

class ShowDataActivity : AppCompatActivity() {
    private lateinit var sp: SharedPreferences
    private lateinit var binding: ActivityShowDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityShowDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        sp = getSharedPreferences("my_sp", MODE_PRIVATE)
        setContentView(binding.root)
        val name = sp.getString("sp_name",null)
        val age = sp.getInt("sp_age",0)
        binding.nameETS.setText(name)
        if (age!=0){
            binding.ageETs.setText(age.toString())
        }

    }
}