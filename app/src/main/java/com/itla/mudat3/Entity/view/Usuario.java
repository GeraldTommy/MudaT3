package com.itla.mudat3.Entity.view;

/**
 * Created by GeraldTommy on 28/11/2017.
 */

public class Usuario {
    Integer     idUsuario;
    String      nombre;
    TipoUsuario usuario;
    String      identifiacacion;
    String      email;
    String      telefono;
    String      clave;
    Boolean     estatus;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TipoUsuario usuario) {
        this.usuario = usuario;
    }

    public String getIdentifiacacion() {
        return identifiacacion;
    }

    public void setIdentifiacacion(String identifiacacion) {
        this.identifiacacion = identifiacacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getEstatus() {
        return estatus;
    }

    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }


}
