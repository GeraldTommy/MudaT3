package com.itla.mudat3.Entity.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class DbConection extends SQLiteOpenHelper {

    public static  String DATATABASE_HOME ="MudaT.db";
    public static  String LOG_T="DbConection";

    public DbConection(Context context){
        super (context,DATATABASE_HOME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        Log.i(LOG_T,"Iniciando OnCreate");

        sqLiteDatabase.execSQL(SqliteHalpeEsquema.usuario_table);
        sqLiteDatabase.execSQL(SqliteHalpeEsquema.anucio_table);
        sqLiteDatabase.execSQL(SqliteHalpeEsquema.categoria_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
