package com.itla.mudat3.Entity.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat3.Entity.view.Anucios;
import com.itla.mudat3.Entity.view.Categoria;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class CategoriaDbo {
    private DbConection com;

    public CategoriaDbo(Context context) {
        com = new DbConection(context);
    }
    public  void  crear(Categoria categoria){
        SQLiteDatabase db=  com.getWritableDatabase();

        ContentValues cv= new ContentValues();
        cv.put("idCategoria",categoria.getIdCategoria());
        cv.put("nombre",categoria.getNombre());

        db.insert("idCategoria",null,cv);
        db.insert("nombre",null,cv);
        db.close();
    }
    public List<Categoria> buscar(){
        List<Categoria> lista= new ArrayList<>();

        SQLiteDatabase db= com.getReadableDatabase();

        String colums []=new String[] {"idCategoria","nombre"};
        Cursor cursor= db.query("idCategoria", colums,null,null,null,null,null,null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Categoria c= new Categoria();
            c.setIdCategoria(cursor.getInt(cursor.getColumnIndex("idCategoria")));

            cursor.moveToLast();
            lista.add(c);
        }
        cursor.close();
        db.close();
        return lista;
    }
}
