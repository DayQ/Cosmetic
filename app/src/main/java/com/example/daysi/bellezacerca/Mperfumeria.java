package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mperfumeria extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mperfumeria);
    }

    public void compraPerfume (View vista){
        Intent nv =new Intent(this,Compras.class);
        startActivity(nv);
    }

}
