package com.example.sharedpreference

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var sp:SharedPreferences
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.saveBtn.setOnClickListener {
            val intent = Intent(this,
                ShowDataActivity::class.java)
            startActivity(intent)

            sp = getSharedPreferences("my_sp", MODE_PRIVATE)
            val name = binding.nameET.text.toString()
            val age = binding.ageET.text.toString().toInt()
            val editor = sp.edit() // edit permission
            editor.apply {

                putString("sp_name",name).toString()
                putInt("sp_age",age).toString()
                commit() //finalize

            }

        }



    }

//    override fun onPause() {
//        super.onPause()
//        val name = binding.nameET.text.toString()
//        val age = binding.ageET.text.toString()
//        val editor = sp.edit() // edit permission
//        editor.apply {
//
//        }
//
//    }
}