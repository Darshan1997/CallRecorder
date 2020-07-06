package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var firstNo: EditText? = null;
    var secondNo: EditText? = null;
    var res: EditText? = null;
    var result:Number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNo = findViewById<EditText>(R.id.firstNO)
        secondNo = findViewById<EditText>(R.id.secondNo)
        res = findViewById<EditText>(R.id.result)

    }

    fun addition(view: View) {
        result =(this.firstNo?.text.toString()).toBigDecimal() + (this.secondNo?.text.toString()).toBigDecimal()
        res?.setText(result.toString())

        Toast.makeText(this, "Addition is $result", Toast.LENGTH_SHORT).show()
    }
}