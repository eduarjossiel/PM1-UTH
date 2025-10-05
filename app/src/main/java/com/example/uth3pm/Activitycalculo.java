package com.example.uth3pm;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Activitycalculo extends AppCompatActivity {

    Button btsuma, btresta, btmulti, btdiv;
    double n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitycalculo);

        btsuma = findViewById(R.id.btsuma);
        btresta = findViewById(R.id.btresta);
        btmulti = findViewById(R.id.btmulti);
        btdiv = findViewById(R.id.btdiv);

        String valor1 = getIntent().getStringExtra("num1");
        String valor2 = getIntent().getStringExtra("num2");

        try {
            n1 = Double.parseDouble(valor1);
            n2 = Double.parseDouble(valor2);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Error: ingresa números válidos", Toast.LENGTH_LONG).show();
            finish();
            return;
        }

        btsuma.setOnClickListener(v -> {
            double resultado = n1 + n2;
            Toast.makeText(this, "La suma es: " + resultado, Toast.LENGTH_LONG).show();
        });

        btresta.setOnClickListener(v -> {
            double resultado = n1 - n2;
            Toast.makeText(this, "La resta es: " + resultado, Toast.LENGTH_LONG).show();
        });

        btmulti.setOnClickListener(v -> {
            double resultado = n1 * n2;
            Toast.makeText(this, "La multiplicación es: " + resultado, Toast.LENGTH_LONG).show();
        });

        btdiv.setOnClickListener(v -> {
            if (n2 == 0) {
                Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
            } else {
                double resultado = n1 / n2;
                Toast.makeText(this, "La división es: " + resultado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
