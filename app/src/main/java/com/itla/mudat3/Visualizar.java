package com.itla.mudat3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Visualizar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar);

        TextView tvNombre1 = (TextView) findViewById(R.id.tvnombre);
        Bundle b = getIntent().getExtras();

        String dato = b.getString( "Nombre" ).toString();
        tvNombre1.setText(dato);
    }
}
