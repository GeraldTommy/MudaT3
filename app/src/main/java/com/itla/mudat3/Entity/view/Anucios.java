package com.itla.mudat3.Entity.view;

import java.util.Date;

/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class Anucios {
    Integer     idAnucio;
    Categoria   categoria;
    Usuario     idUsuario;
    Date        fecha;
    String      condicion;
    Integer     precio;
    String      titulo;
    String      ubicación;
    String      detalle;
    public Integer getIdAnucio() {
        return idAnucio;
    }

    public void setIdAnucio(Integer idAnucio) {
        this.idAnucio = idAnucio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


}
