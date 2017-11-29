package com.itla.mudat3.Entity.Dao;

/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class SqliteHalpeEsquema {
    public static final String usuario_table = "CREATE TABLE `usuario` (" +
            "`id_usuario`INTEGER NOT NULL," +
            "`nombre`tTEXT NOT NULL," +
            "`tipo_usuario`TEXT NOT NULL," +
            "`identifiacacion`INTEGER NOT NULL," +
            "`email`tTEXT," +
            "`telefono`TEXT NOT NULL," +
            "`clave`TEXT NOT NULL," +
            "`estatus`TEXT NOT NULL," +
            "PRIMARY KEY(`id_usuario`)";

    public static final String categoria_table = "CREATE TABLE `categoria` ("+
            "`id_categoria`	INTEGER NOT NULL,"+
            "`nombre`	TEXT NOT NULL,"+
            "PRIMARY KEY(`id_categoria`)";

    public static final String anucio_table = "CREATE TABLE `ANUNCIO` (" +
            "`Id_Anucio`INTEGER NOT NULL," +
            "`Id_Categoria`INTEGER NOT NULL," +
            "`Id_Usuario`INTEGER NOT NULL," +
            "`Fecha`INTEGER NOT NULL," +
            "`Condicion`TEXT," +
            "`Precio`INTEGER NOT NULL," +
            "`Titulo`TEXT," +
            "`Ubicación`TEXT NOT NULL," +
            "`Detalle`TEXT," +
            "PRIMARY KEY(`Id_Anucio`)";

}
