package com.bignerdranch.android.pr23_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class ResultActivity : WearableActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button = findViewById(R.id.button3)
        button.setOnClickListener{
            Snackbar.make(it, "Succes", Snackbar.LENGTH_LONG)
        }
    }
}