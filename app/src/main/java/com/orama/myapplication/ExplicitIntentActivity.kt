package com.orama.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntentActivity : AppCompatActivity() {


    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_EMAIL = "extra_email"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)
        txt_nama.text = "Rizky Orama"

        btn_back.setOnClickListener {
            val backItem = Intent(this@ExplicitIntentActivity, MainActivity::class.java)
            startActivity(backItem)
        }

    }
}