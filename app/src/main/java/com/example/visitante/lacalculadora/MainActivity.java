package com.example.visitante.lacalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] BotonesNumericos = {R.id.button0, R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5,
            R.id.button6, R.id.button7, R.id.button8, R.id.button9};
    int[] Operadores = {R.id.buttonMAS, R.id.buttonMENOS, R.id.buttonMULT, R.id.buttonDIV, R.id.buttonDIV};

    TextView operacion;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operacion = (TextView) findViewById(R.id.textViewOperacion);
        resultado = (TextView) findViewById(R.id.textViewResultado);

        setOperacion();


    }

    private void setOperacion() {
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Button boton = (Button) view;
                operacion.append(boton.getText());
            }
        };
    }



}
