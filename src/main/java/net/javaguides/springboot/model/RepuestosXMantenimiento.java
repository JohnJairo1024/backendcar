package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "repuestos_x_mantenimiento")
public class RepuestosXMantenimiento {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Long unidades;

    private Long tiempo_estimado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_mantenimiento", referencedColumnName = "codigo")
    private Mantenimiento mantenimiento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_repuesto", referencedColumnName = "codigo")
    private Repuestos repuestos;

}
