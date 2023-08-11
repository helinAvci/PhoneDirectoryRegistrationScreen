package com.helinavci.phonedirectoryregistrationscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.TextView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name  : TextView = findViewById(R.id.name)
        val phone  : TextView = findViewById(R.id.phone)
        val buttomSave : Button = findViewById(R.id.save)
        buttomSave.setOnClickListener {
            if(name.text.isEmpty() || phone.text.isEmpty()){
                Snackbar.make(it,"Please full the all empty place" , Snackbar.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity ,secondPage :: class.java)
                startActivity(intent)

            }

        }
    }
}