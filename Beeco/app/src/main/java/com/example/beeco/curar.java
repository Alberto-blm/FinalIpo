package com.example.beeco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class curar extends AppCompatActivity {

    Button polilla, escarabajo, mosca, mosquito, avispa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curar);

        polilla = (Button) findViewById(R.id.button7);

        polilla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(curar.this, Correcto.class));

            }
        });

        escarabajo = (Button) findViewById(R.id.button8);

        escarabajo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(curar.this, Correcto.class));

            }
        });

        mosca = (Button) findViewById(R.id.button9);

        mosca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(curar.this, Correcto.class));

            }
        });

        mosquito = (Button) findViewById(R.id.button10);

        mosquito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(curar.this, Correcto.class));

            }
        });

        avispa = (Button) findViewById(R.id.button11);

        avispa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(curar.this, Correcto.class));

            }
        });
    }
}
