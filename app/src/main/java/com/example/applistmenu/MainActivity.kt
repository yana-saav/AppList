package com.example.applistmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applistmenu.databinding.ActivityMainBinding
import com.example.applistmenu.list.ArticleAdapter
import com.example.applistmenu.list.ArticleModel
import com.example.applistmenu.list.ListFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportFragmentManager.beginTransaction()
//            .replace(binding.listFragment.id, ListFragment())
//            .addToBackStack(null)
//            .commit()
    }

}