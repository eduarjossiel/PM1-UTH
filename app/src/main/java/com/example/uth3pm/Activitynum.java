package com.example.uth3pm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitynum extends AppCompatActivity {

    EditText num1, num2;

    Button btcalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_activitynum);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        btcalcular = (Button) findViewById(R.id.btcalcular);

        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activitynum.this,num1.getText().toString(),Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Activitynum.this, Activitycalculo.class);

                intent.putExtra("num1",num1.getText().toString());
                intent.putExtra("num2",num2.getText().toString());
                startActivity(intent);
            }
        });


    }
}