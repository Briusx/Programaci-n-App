package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import exam1.ExamenProg2;

public class ExamenProgramacion1 extends AppCompatActivity {

    private Button btnExamenLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_programacion1);

        btnExamenLogin = findViewById(R.id.btn_sign_in_anahuac);

        btnExamenLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ExamenProgramacion1.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ExamenProgramacion1.this, ExamenProg2.class);
                startActivity(intent);
            }
        });
    }
}