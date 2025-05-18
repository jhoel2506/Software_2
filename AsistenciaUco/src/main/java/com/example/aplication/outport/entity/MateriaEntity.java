package com.example.aplication.outport.entity;

import java.util.UUID;

import com.example.crosscutting.helpers.TextHelper;
import com.example.crosscutting.helpers.UUIDHelper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Materia")
public class MateriaEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "clave")
    private String clave;

    @Column(name = "nombre")
    private String nombre;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = TextHelper.getDefault(clave);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = TextHelper.getDefault(nombre);
    }

    public MateriaEntity() {
        setDefaultId();
        setDefaultClave();
        setDefaultNombre();
    }

    public MateriaEntity(UUID id, String clave, String nombre) {
        setId(id);
        setClave(clave);
        setNombre(nombre);
    }

    private void setDefaultId() {
        setId(UUIDHelper.generate());
    }

    private void setDefaultClave() {
        setClave(TextHelper.getDefault(null));
    }

    private void setDefaultNombre() {
        setNombre(TextHelper.getDefault(null));
    }
}
