package struct;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(
        name = "vehiculos"
)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "tipo",
        discriminatorType = DiscriminatorType.STRING
)
public class Vehiculo implements Serializable {

    //
    //  Id
    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehiculo;

    //
    //  Atributos
    //
    private String patente;
    private Integer stock;
    private Double km_recorrido;

    @OneToOne
    private Alquiler alquiler;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Sucursal sucursal;

    //
    //  Default constructor
    //
    public Vehiculo() {
    }

    //
    //  Getters & setters
    //
    public Long getId_vehiculo() {
        return id_vehiculo;
    }
    public void setId_vehiculo(Long id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Double getKm_recorrido() {
        return km_recorrido;
    }
    public void setKm_recorrido(Double km_recorrido) {
        this.km_recorrido = km_recorrido;
    }
    public Alquiler getAlquiler() {
        return alquiler;
    }
    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
