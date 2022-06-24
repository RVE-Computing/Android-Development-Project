package com.sorleon.recetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_primer_plato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_plato);
    }

    //Metodo del boton para ir a Macarrones
    public void macarrones(View view){
        Intent macarrones = new Intent(this, Macarrones.class);
        startActivity(macarrones);
    }

    //Metodo del boton para ir a Sopa
    public void sopa(View view){
        Intent sopa = new Intent(this, Sopa.class);
        startActivity(sopa);
    }

    //Metodo del boton para ir a Huevo frito
    public void huevoFrito(View view){
        Intent huevoFrito = new Intent(this, HuevoFrito.class);
        startActivity(huevoFrito);
    }
}