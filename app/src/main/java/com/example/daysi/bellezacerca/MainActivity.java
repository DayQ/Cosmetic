package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void promotor(View vista){
    Intent nv =new Intent(this,PromotorActivity.class);
    startActivity(nv);
}

    public void cliente(View vista){
        Intent nv =new Intent(this,ClienteActivity.class);
        startActivity(nv);
    }

    public void ofertas(View vista){
        Intent nv =new Intent(this,ofertas.class);
        startActivity(nv);
    }
}
