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

        //Metodo del boton para ir a macedonia
        public void macedonia(View view){
            Intent macedonia = new Intent(this, Macedonia.class);
            startActivity(macedonia);
        }

        //Metodo del boton para ir a Sopa
        public void tartaqueso(View view){
            Intent tartaqueso = new Intent(this, TartaQueso.class);
            startActivity(tartaqueso);
        }

        //Metodo del boton para ir a Huevo frito
        public void salmon(View view){
            Intent salmon = new Intent(this, Salmon.class);
            startActivity(salmon);
        }
    }



}

