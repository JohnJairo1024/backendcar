package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "repuestos")
public class Repuestos {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String nombre_repuesto;
    private Long precio_unitario;
    private Long unidades_inventario;
    private String proveedor;


}
