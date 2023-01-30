package com.yashishu.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textname:EditText=findViewById(R.id.textname)
        val textcont:EditText=findViewById(R.id.textcont)
        val textmail:EditText=findViewById(R.id.textmail)
        val button:Button=findViewById(R.id.button)
        val showname:TextView=findViewById(R.id.showname)
        val showcont:TextView =findViewById(R.id.showcont)
        val showmail:TextView=findViewById(R.id.showmail)
        val status:TextView=findViewById(R.id.status)
        button.setOnClickListener{
            status.text="Form submitted"
            //extracting data
            val name=textname.text.toString()
            val email=textcont.text.toString()
            val cont=textmail.text.toString()
            //displaying
            showname.text=name
            showcont.text=email
            showmail.text=cont
        }

    }
}