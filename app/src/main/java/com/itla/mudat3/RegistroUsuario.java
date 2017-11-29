package com.itla.mudat3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.mudat3.Entity.Dao.UsuarioDbo;
import com.itla.mudat3.Entity.view.TipoUsuario;
import com.itla.mudat3.Entity.view.Usuario;

public class RegistroUsuario extends AppCompatActivity implements View.OnClickListener{

    public static  String LOG_T="RegistroUsuario";
    UsuarioDbo usuarioDbo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        Button btnAceptar=(Button) findViewById(R.id.btnacectar);
        btnAceptar.setOnClickListener(this);
        Button btnListar=(Button) findViewById(R.id.btncanselar);
        btnListar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnacectar:
                EditText txtNombre = findViewById(R.id.txtnombre);
                EditText txtClave = findViewById(R.id.txtclave);
                EditText txtemail = findViewById(R.id.txtemail);
                EditText txtIdentificacion = findViewById(R.id.txtidentificacion);
                EditText txttelefono = findViewById(R.id.txttelefono);
                EditText txtTipo = findViewById(R.id.txttipo);

                Usuario usuario = new Usuario();


                usuario.setNombre(txtNombre.getText().toString());
                usuario.setClave(txtClave.getText().toString());
                usuario.setEmail(txtemail.getText().toString());
                usuario.setIdentifiacacion(txtIdentificacion.getText().toString());
                usuario.setTelefono(txttelefono.getText().toString());
                usuario.setUsuario(TipoUsuario.CLIENTE);

                Log.i(LOG_T,"Reguistrando Usuario"+usuario.toString());
                usuarioDbo.crear(usuario);

                break;

            case R.id.btncanselar:


                break;

            default:
                break;

        }
    }
}
