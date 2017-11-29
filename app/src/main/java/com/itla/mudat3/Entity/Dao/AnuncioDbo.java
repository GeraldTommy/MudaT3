package com.itla.mudat3.Entity.Dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat3.Entity.view.Anucios;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class AnuncioDbo {
    private DbConection com;

    public AnuncioDbo(Context context) {
        com = new DbConection(context);
    }
    public  void  crear(Anucios anucios){
        SQLiteDatabase db=  com.getWritableDatabase();

        ContentValues cv= new ContentValues();
        cv.put("idAnucio",anucios.getIdAnucio());
        cv.put("categoria",anucios.getCategoria().toString());
        cv.put("idUsuario", anucios.getIdUsuario().toString());
        cv.put("fecha",anucios.getFecha().toString());
        cv.put("condicion",anucios.getCondicion());
        cv.put("precio",anucios.getPrecio());
        cv.put("titulo",anucios.getTitulo());
        cv.put("ubicación",anucios.getUbicación());
        cv.put("detalle",anucios.getDetalle());

        db.insert("idAnucio",null,cv);
        db.insert("categoria",null,cv);
        db.insert("idUsuario",null,cv);
        db.insert("identificacion",null,cv);
        db.insert("condicion",null,cv);
        db.insert("precio",null,cv);
        db.insert("titulo",null,cv);
        db.insert("ubicación",null,cv);
        db.insert("detalle",null,cv);
        db.close();
    }
    public List<Anucios> buscar(){
        List<Anucios> lista= new ArrayList<>();

        SQLiteDatabase db= com.getReadableDatabase();

        String colums []=new String[] {"idAnucio","categoria","idUsuario","identificacion","condicion","precio","titulo","ubicación","detalle"};
        Cursor cursor= db.query("idAnucio", colums,null,null,null,null,null,null);

        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Anucios a= new Anucios();
            a.setIdAnucio(cursor.getInt(cursor.getColumnIndex("idAnucio")));

            cursor.moveToLast();
            lista.add(a);
        }
        cursor.close();
        db.close();
        return lista;
    }
}
