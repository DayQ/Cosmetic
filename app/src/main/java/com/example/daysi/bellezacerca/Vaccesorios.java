package com.example.daysi.bellezacerca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Vaccesorios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccesorios);
    }

    public void comprar(View vista){
        Intent nv =new Intent(this,Compras.class);
        startActivity(nv);
    }

}