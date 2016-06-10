package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by daysi on 05-05-16.
 */
public class NinosActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninos);


    }

    public void LocionK (View vista){
        Intent nv =new Intent(this,LocionKids.class);
        startActivity(nv);
    }

    public void RopaK (View vista){
        Intent nv =new Intent(this,RopaKids.class);
        startActivity(nv);
    }
    public void baby (View vista){
        Intent nv =new Intent(this,Babys.class);
        startActivity(nv);
    }
    public void acck (View vista){
        Intent nv =new Intent(this,AccesoriosKids.class);
        startActivity(nv);
    }
    }

