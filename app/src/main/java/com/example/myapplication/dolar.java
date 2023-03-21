package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class dolar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);
    }

    public void converter(View view){
        EditText editDolar;
        TextView textResultado;

        editDolar=findViewById(R.id.editDloar);
        textResultado=findViewById(R.id.TextResulatdo);

        Double valorDolar=Double.parseDouble(editDolar.getText().toString());

        Double valorCovertido=valorDolar * 5.25;
        textResultado.setText("Valor em R$: " + valorCovertido);
    }
}
