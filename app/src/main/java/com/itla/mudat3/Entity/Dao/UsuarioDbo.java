package com.itla.mudat3.Entity.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import com.itla.mudat3.Entity.view.Usuario;

/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class UsuarioDbo {
    private DbConection com;

    public UsuarioDbo(Context context) {
        com = new DbConection(context);
    }
    public  void  crear(Usuario usuario){
        SQLiteDatabase db=  com.getWritableDatabase();

        ContentValues cv= new ContentValues();
        cv.put("idUsuario",usuario.getIdUsuario());
        cv.put("nombre",usuario.getNombre());
        cv.put("usuario", usuario.getUsuario().toString());
        cv.put("identificacion",usuario.getIdentifiacacion());
        cv.put("email",usuario.getEmail());
        cv.put("telefono",usuario.getTelefono());
        cv.put("clave",usuario.getClave());
        cv.put("estatus",usuario.getEstatus());

        db.insert("idUsuario",null,cv);
        db.insert("nombre",null,cv);
        db.insert("usuario",null,cv);
        db.insert("identificacion",null,cv);
        db.insert("email",null,cv);
        db.insert("telefono",null,cv);
        db.insert("clave",null,cv);
        db.insert("estatus",null,cv);
        db.close();
    }
    public List<Usuario> buscar(){
        List<Usuario> lista= new ArrayList<>();

        SQLiteDatabase db= com.getReadableDatabase();

        String colums []=new String[] {"idUsuario","Nombre","usuario","identificacion","email","telefono","clave","estatus"};
        Cursor cursor= db.query("nombre", colums,null,null,null,null,null,null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Usuario u= new Usuario();
            u.setIdUsuario(cursor.getInt(cursor.getColumnIndex("idUsuario")));

            cursor.moveToLast();
            lista.add(u);
        }
        cursor.close();
        db.close();
        return lista;
    }
}
