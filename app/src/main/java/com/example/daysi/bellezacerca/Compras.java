package com.example.daysi.bellezacerca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Compras extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
    }

    public void adquirir(View v){

        Toast.makeText(this, " REGISTRO FINALIZADO !!!", Toast.LENGTH_LONG).show();
        TextView ab=(TextView) findViewById(R.id.textView40);
        ab.setText("EN UN MOMENTO "+"\n"+"NOS CONTACTAMOS CON UD..!!");

    }

    


}
