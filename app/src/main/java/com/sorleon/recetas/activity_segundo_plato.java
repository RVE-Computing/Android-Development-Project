package com.sorleon.recetas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_segundo_plato extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_plato);
    }

    //Metodo del boton para ir a Hamburguesa
    public void hamburguesa(View view){
        Intent hamburguesa = new Intent(this, Hamburguesa.class);
        startActivity(hamburguesa);
    }

    //Metodo del boton para ir a Ensalada
    public void ensalada(View view){
        Intent ensalada = new Intent(this, Ensalada.class);
        startActivity(ensalada);
    }

    //Metodo del boton para ir a Salmon
    public void salmon(View view){
        Intent salmon = new Intent(this, Salmon.class);
        startActivity(salmon);
    }
}
