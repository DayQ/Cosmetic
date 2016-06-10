package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by daysi on 05-05-16.
 */
public class Ellos_Activity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ellos);
    }

    public void vperfumes(View v){
        Intent nv = new Intent(this, Vperfumes.class);
        startActivity(nv);
    }

    public void  vaccesorios (View vista){
        Intent nv = new Intent(this, Vaccesorios.class);
        startActivity(nv);
    }

    public void  piel (View vista){
        Intent nv = new Intent(this, Vpiel.class);
        startActivity(nv);
    }

    public void  ropav (View vista){
        Intent nv = new Intent(this, Vropa.class);
        startActivity(nv);
    }


}
