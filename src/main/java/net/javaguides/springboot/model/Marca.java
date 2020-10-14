package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nombre_marca;

}
