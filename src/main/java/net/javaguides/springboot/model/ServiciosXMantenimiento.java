package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "servicios_x_mantenimiento")
public class ServiciosXMantenimiento {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Long tiempo_estimado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_servicio", referencedColumnName = "codigo")
    private Servicios servicios;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_mantenimiento", referencedColumnName = "codigo")
    private Mantenimiento mantenimiento;

}
