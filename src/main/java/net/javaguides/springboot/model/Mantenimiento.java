package net.javaguides.springboot.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "mantenimiento")
public class Mantenimiento {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private int estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_placa", referencedColumnName = "placa")
    private Vehiculo vehiculo;

    private String fecha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "men_documento", referencedColumnName = "documento")
    private Mecanicos mecanicoDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "men_tipo_documento", referencedColumnName = "tipo_documento")
    private Mecanicos mecanicoTipoDocumento;

    public Mantenimiento() {
    }

    public Mantenimiento(int codigo, int estado, String fecha) {
        this.codigo = codigo;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Mantenimiento(int codigo, int estado, Vehiculo vehiculo, String fecha, Mecanicos mecanicoDocumento, Mecanicos mecanicoTipoDocumento) {
        this.codigo = codigo;
        this.estado = estado;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.mecanicoDocumento = mecanicoDocumento;
        this.mecanicoTipoDocumento = mecanicoTipoDocumento;
    }
}
