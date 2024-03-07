package com.senac.frasediaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){
        String[] frases = {
                "Bom final de semana",
                "O fim está próximo",
                "Tá acabando",
                "Cuidado com a chuva"
        };
        int numero = new Random().nextInt(4);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }
}