package com.example.daysi.bellezacerca;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ofertas extends Activity {

    int ofertas[] = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p8};
    int indice = 0;
    int pu[] = {15, 18, 25, 25, 28, 32, 65};
    int pedidos[] = {0, 0, 0, 0, 0, 0, 0};
    int totalapagar = 0;
    String titulos[] = {"TRUE ROSS + DELINEADORES", "ALARGADORES DE PESTAÑAS ", "SOMBRAS CHICK ",
            "FLIRTY GIRLS SEXI", "PRINTS CY-ZONE ", "MAKEUP COOL", "ross salvaje"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas);
    }

    public void informacion(View vista) {
       Intent nv = new Intent(this, InformacionOfertas.class);
        startActivity(nv);
    }

    public void siguiente(View vista) {
        ImageView pg = (ImageView) findViewById(R.id.imageView);
        TextView pt = (TextView) findViewById(R.id.textView3);
        TextView pp = (TextView) findViewById(R.id.textView24);
        indice++;
        if (indice > 6) indice = 0;
        pg.setImageResource(ofertas[indice]);
        pt.setText(titulos[indice]);
        pp.setText(pu[indice] + " Bs. ");
        TextView pttp = (TextView) findViewById(R.id.textView7);
        TextView ptp = (TextView) findViewById(R.id.textView8);
        ptp.setText(pu[indice] * pedidos[indice] + "");
        TextView pnp = (TextView) findViewById(R.id.textView11);
        pnp.setText(pedidos[indice] + "");

    }

    public void anterior(View vista) {
        ImageView pg = (ImageView) findViewById(R.id.imageView);
        TextView pt = (TextView) findViewById(R.id.textView3);
        TextView pp = (TextView) findViewById(R.id.textView24);
        indice--;
        if (indice < 0) indice = 6;
        pg.setImageResource(ofertas[indice]);
        pt.setText(titulos[indice]);
        pp.setText(pu[indice] + " Bs. ");
        TextView ptp = (TextView) findViewById(R.id.textView8);
        ptp.setText(pu[indice] * pedidos[indice] + "");
        TextView pnp = (TextView) findViewById(R.id.textView11);
        pnp.setText(pedidos[indice] + "");

    }

    public void adquirir(View vista) {
        {
            pedidos[indice]++;
            totalapagar = totalapagar + pu[indice];
            TextView pnp = (TextView) findViewById(R.id.textView8);
            TextView ptp = (TextView) findViewById(R.id.textView11);
            TextView ptotp = (TextView) findViewById(R.id.textView53);
            pnp.setText(pedidos[indice] + "");
            ptp.setText(pu[indice] * pedidos[indice] + " ");
            ptotp.setText(totalapagar + " ");
        }
    }

    public void devolver(View vista) {
        if (pedidos[indice] == 0) {
            Toast.makeText(this, "no se puede devolver adquiera productos..!!!", Toast.LENGTH_LONG).show();
        } else {
            pedidos[indice]--;
            totalapagar = totalapagar - pu[indice];
            TextView pnp = (TextView) findViewById(R.id.textView8);
            TextView ptp = (TextView) findViewById(R.id.textView11);
            TextView ptotp = (TextView) findViewById(R.id.textView53);
            pnp.setText(pedidos[indice] + "");
            ptp.setText(pu[indice] * pedidos[indice] + "");
            ptotp.setText(totalapagar + "");
        }
    }
}

