package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Factura {

    @Id
    private Long codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_factura", referencedColumnName = "documento")
    private Clientes clientes;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_estado", referencedColumnName = "estado")
    private Mantenimiento mantenimiento;


}
