package com.example.fragmentocolores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), IComunicador {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBtnSuma() {

        val lblResultado = findViewById<TextView>(R.id.lblResultado);
        var suma = Integer.parseInt(lblResultado.text.toString()) + 1
        lblResultado.text = suma.toString()

    }

    override fun onBtnResta() {
        val lblResultado = findViewById<TextView>(R.id.lblResultado);
        var resta = Integer.parseInt(lblResultado.text.toString()) - 1
        lblResultado.text = resta.toString()
    }
}