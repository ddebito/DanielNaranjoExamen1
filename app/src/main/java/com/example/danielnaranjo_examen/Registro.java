package com.example.danielnaranjo_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Registro extends AppCompatActivity {

    TextView txtUsuario, txtMonto, txtPago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtUsuario = findViewById(R.id.txtUsuario);
        txtMonto = findViewById(R.id.txtMonto);
        txtPago = findViewById(R.id.txtPago);

        Bundle bundle = getIntent().getExtras();
        String user=bundle.getString("usuario");
        txtUsuario.setText(user);



        }

    public void Calcular (View view) {
        int MontoEntero = Integer.getInteger(txtMonto.toString());
        int PagoEntero = (2000-MontoEntero)/6;
        String PagoCalculo = (getString(PagoEntero));
        txtPago.setText(PagoCalculo);
    }

    public void Grabar (View view)
        {
            Intent i = new Intent(this, Encuesta.class);
            i.putExtra("usuario", txtUsuario.getText().toString());
            i.putExtra("monto", txtMonto.getText().toString());
            i.putExtra("pago", txtPago.getText().toString());
            Toast.makeText(this, "Elemento guardado con exito", Toast.LENGTH_LONG).show();
            startActivity(i);
        }






}
