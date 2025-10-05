package com.example.uth3pm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityDash extends AppCompatActivity {
    Button btnagregar, btncontactos, btncombo, btcalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dash);

        btnagregar = (Button) findViewById(R.id.btnagregar);
        btncontactos = (Button) findViewById(R.id.btncontactos);
        btncombo = (Button) findViewById(R.id.btncombo);
        btcalculadora = (Button) findViewById(R.id.btcalculadora);

        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityDash.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btncombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        btncontactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        btcalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ActivityDash.this, Activitynum.class);
                startActivity(intent);

            }
        });

    }
}