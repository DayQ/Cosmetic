package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by daysi on 03-05-16.
 */
public class ClienteActivity extends  Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void E1 (View vista){
        Intent nv =new Intent(this,EllasActivity.class);
        startActivity(nv);
    }

    public void ellos (View vista){
        Intent nv =new Intent(this,Ellos_Activity.class);
        startActivity(nv);
    }

    public void ninos (View vista){
        Intent nv =new Intent(this,NinosActivity.class);
        startActivity(nv);
    }
}
