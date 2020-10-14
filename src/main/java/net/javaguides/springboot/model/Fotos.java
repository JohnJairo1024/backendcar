package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "fotos")
public class Fotos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String ruta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_mantenimiento", referencedColumnName = "codigo")
    private Mantenimiento mantenimiento;

}
