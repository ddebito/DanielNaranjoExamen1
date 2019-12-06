package com.example.danielnaranjo_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText usuario, password;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        usuario = (EditText) findViewById(R.id.txtUsuario);
        password = (EditText) findViewById(R.id.txtContraseña);

    }

    public void Ingresar(View view){
        Intent i=new Intent(this,Registro.class);
        i.putExtra("usuario", usuario.getText().toString());
        i.putExtra("password", password.getText().toString());


        if(usuario.getText().toString().equals("estudiante2019") && password.getText().toString().equals("uisrael2019") ){
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show();
            startActivity(i);
        }

        //Toast.makeText(this, usuario.getText().toString(), Toast.LENGTH_LONG).show();

    }


}
