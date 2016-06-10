package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by daysi on 05-05-16.
 */
public class EllasActivity extends  Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellas);


    }

    public void mperfume(View vista) {

        Intent nv = new Intent(this, Mperfumeria.class);
        startActivity(nv);
    }

    public void maccesorios(View v) {
        Intent nv = new Intent(this, Maccesorios.class);
        startActivity(nv);
    }

    public void mmaquillaje(View v) {
        Intent nv = new Intent(this, Mmaquillaje.class);
        startActivity(nv);
    }

    public void mboutique(View v) {
        Intent nv = new Intent(this,Mboutique.class);
        startActivity(nv);
    }





}

