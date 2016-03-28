package com.pccomponentes.quiensoy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Localizar los controles
        txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        String respuesta = "Hola soy " + bundle.getString("NOMBRE")
                + " del dpto de " + bundle.getString("DPTO");
        txtSaludo.setText(respuesta);
    }

}
