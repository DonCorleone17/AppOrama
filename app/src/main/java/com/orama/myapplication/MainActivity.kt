package com.orama.myapplication

import android.content.Intent
import android.content.Intent.EXTRA_EMAIL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_simple_intent = findViewById<Button>(R.id.btn_simple_intent)
        val btn_intent_with_data = findViewById<Button>(R.id.btn_intent_with_data)
        val btn_intent_with_parcelable = findViewById<Button>(R.id.btn_intent_with_parcelable)
        val btn_implicit_intent = findViewById<Button>(R.id.btn_implicit_intent)
        val btn_intent_with_result = findViewById<Button>(R.id.btn_intent_with_result)

        btn_simple_intent.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java)
            startActivity(simpleIntent)
        }
        btn_intent_with_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplicitIntentActivity::class.java)
            startActivity(dataIntent)
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_NAMA, "Rizky Orama")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_AGE, "20")
            dataIntent.putExtra(ExplicitIntentActivity.EXTRA_EMAIL, "mukebatu@gmail.com")

        }
    }
}