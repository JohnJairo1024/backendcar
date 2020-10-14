package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    private String placa;
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_marca", referencedColumnName = "codigo")
    private Marca marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cli_documento", referencedColumnName = "documento")
    private Clientes clientesDocumento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cli_tipo_documento", referencedColumnName = "tipo_documento")
    private Clientes clientesTipoDocumento;

}
