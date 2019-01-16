package com.tapir.org.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class BasicType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String mensaje;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
