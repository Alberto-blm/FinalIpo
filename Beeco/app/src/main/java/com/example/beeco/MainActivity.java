package com.example.beeco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button device1, device2, device3,device4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        device1 = (Button) findViewById(R.id.button3);

        device1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(MainActivity.this, Seleccion.class));

            }
        });

        device2 = (Button) findViewById(R.id.button2);

        device2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(MainActivity.this, Seleccion.class));

            }
        });

        device3 = (Button) findViewById(R.id.button4);

        device3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(MainActivity.this, Seleccion.class));

            }
        });

        device4 = (Button) findViewById(R.id.button5);

        device4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                startActivity(new Intent(MainActivity.this, Seleccion.class));

            }
        });
    }



}
