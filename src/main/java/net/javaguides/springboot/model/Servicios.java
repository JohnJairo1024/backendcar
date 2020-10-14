package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "servicios")
public class Servicios {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private Long estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_placa", referencedColumnName = "placa")
    private Vehiculo vehiculo;

    private String fecha;

    @Column(name = "mec_documento")
    private Long mecDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "men_documento", referencedColumnName = "documento")
    private Mecanicos mecanicoDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "men_tipo_documento", referencedColumnName = "tipo_documento")
    private Mecanicos mecanicoTipoDocumento;

}
