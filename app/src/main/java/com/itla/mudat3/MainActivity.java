package com.itla.mudat3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txtNombre;
        txtNombre = findViewById(R.id.txtnombre);
        Button btnejecutar= findViewById(R.id.btnEjecutar);

        btnejecutar.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               //Toast mesage= Toast.makeText (MainActivity.this,"HolaMundo",Toast.LENGTH_LONG);
                                               //mesage.show();
                                               Bundle paremetros = new Bundle();

                                               //paremetros.putString("Nombre", txtNombre.getText().toString());
                                               //Intent visualizar= new Intent(MainActivity.this,Visualizar.class);

                                               //visualizar.putExtras(paremetros);
                                               //startActivity(visualizar);
                                               Intent usuario= new Intent(MainActivity.this,RegistroUsuario.class);

                                               usuario.putExtras(paremetros);
                                               startActivity(usuario);
                                           }
                                       }
        );
    }
}
