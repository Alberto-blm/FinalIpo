package com.example.beeco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Configuracion extends AppCompatActivity {

    Button palabra, comando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        palabra = (Button) findViewById(R.id.button13);

        palabra.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(Configuracion.this, KeyWord.class));

            }
        });

        comando = (Button) findViewById(R.id.button12);

        comando.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(Configuracion.this, Comandos.class));

            }
        });
    }


}
