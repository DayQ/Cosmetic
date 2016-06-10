package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by daysi on 03-05-16.
 */
public class PromotorActivity extends Activity{
   private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotor);



    }


    public void ingresar(View vista){
        et1=(EditText) findViewById(R.id.editText2);
        et2=(EditText) findViewById(R.id.editText);
        String a,b;
        a=et1.getText().toString();
        b=et2.getText().toString();
        if(a=="daysi" & b=="123"){
            Toast.makeText(this,"introdusca datos correctos",Toast.LENGTH_LONG).show();
        }
        else{
            Intent nv =new Intent(this,ControlClienteProducto.class);
            startActivity(nv);
        }
    }

    public void salir(View vista){
        finish();
    }

}
