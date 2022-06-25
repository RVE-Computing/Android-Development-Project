package com.sorleon.recetas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    //Metodo del boton para ir a Primer plato
    public void primerPlato(View view){
        Intent primerPlato = new Intent(this, PrimerPlato.class);
        startActivity(primerPlato);
    }

    //Metodo del boton para ir a Segundo plato
    public void segundoPlato(View view){
        Intent segundoPlato = new Intent(this, SegundoPlato.class);
        startActivity(segundoPlato);
    }

    //Metodo del boton para ir a Postre
    public void postre(View view){
        Intent postre = new Intent(this, activity_postre.class);
        startActivity(postre);
    }
}