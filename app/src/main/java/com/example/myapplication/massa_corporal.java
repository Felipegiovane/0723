package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class massa_corporal extends AppCompatActivity {

    int peso;
    float altura;
    float IMC;
    String mensagem = "";

    EditText editpeso, editaltura;
    TextView txtResultado;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massa_corporal);

        editpeso=(EditText) findViewById(R.id.peso);
        editaltura=(EditText) findViewById(R.id.altura);
        txtResultado=(TextView) findViewById(R.id.resulatdo);
        btCalcular=(Button) findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                peso= Integer.parseInt(editpeso.getText().toString());
                altura= Integer.parseInt(editaltura.getText().toString());

                IMC=peso / (altura * altura);

                if (IMC < 18.5) {
                    mensagem = "Abaixo do Peso";
                }else if ((IMC>=18.5) && (IMC< 25)) {
                    mensagem = "Peso Ideal (Parabens!!!)";
                }
                txtResultado.setText("IMC:"+ String.valueOf(IMC) + "\nmensagem:" + mensagem);
            }
        });
    }
}