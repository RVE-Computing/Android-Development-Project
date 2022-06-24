package com.sorleon.recetas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_postre {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postre);
    }

    private void setContentView(int activity_postre) {

        //La idea puede ser 1 pantalla por postre o 1 pantalla de contenido variable en funcion del botón

        //Metodo del boton para ir a macedonia
        public void macedonia(View view){
            Intent macedonia = new Intent(this, Detalle_postre1.class);
            startActivity(macedonia);
        }

        //Metodo del boton para ir a Tarta de queso
        public void tartaqueso(View view){
            Intent tartaqueso = new Intent(this, Detalle_postre1.class);
            startActivity(tartaqueso);
        }

        //Metodo del boton para ir a Churros
        public void churros(View view){
            Intent churros = new Intent(this, Detalle_postre1.class);
            startActivity(churros);
        }
    }




}



