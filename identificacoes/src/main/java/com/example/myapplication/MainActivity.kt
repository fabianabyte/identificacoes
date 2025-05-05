package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnGerar: Button
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGerar = findViewById(R.id.btnGerar)
        txtResultado = findViewById(R.id.txtResultado)

        btnGerar.setOnClickListener {
            gerarTexto()
        }
    }

    private fun gerarTexto() {
        // Aqui você pode implementar a lógica para gerar o texto
        val textoGerado = "Texto gerado em: ${System.currentTimeMillis()}"
        txtResultado.text = textoGerado
    }
}