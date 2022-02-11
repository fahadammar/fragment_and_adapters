package com.example.fragadap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fragadap.Fragments.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onBtn1(view: View){
        val frag_1 = FirstFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentLayout, frag_1).commit()
    }

    fun onBtn2(view: View){
        val intent = Intent(this, ActOfList::class.java);
        this.startActivity(intent);
    }


}