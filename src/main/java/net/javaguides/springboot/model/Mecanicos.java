package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "mecanicos")
public class Mecanicos {

    @Id
    private Long documento;
    private String tipo_documento;
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @Column(name = "celular")
    private String celular;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "estado")
    private Boolean estado;

    public Mecanicos() {
    }

    public Mecanicos(Long documento, String tipo_documento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String celular, String direccion, String email, Boolean estado) {
        this.documento = documento;
        this.tipo_documento = tipo_documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celular = celular;
        this.direccion = direccion;
        this.email = email;
        this.estado = estado;
    }
}
