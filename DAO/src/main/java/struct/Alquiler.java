package struct;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(
        name = "alquileres"
)
public class Alquiler implements Serializable {

    //
    //  Id
    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alquiler;

    //
    //  Atributos
    //
    private Date fecha_creacion;
    private Date fecha_estimada_devolucion;
    private Date fecha_devolucion;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Sucursal destino;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Sucursal origen;
    @OneToOne(
            mappedBy = "alquiler",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Vehiculo vehiculo;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Cliente cliente;

    //
    //  Default contructor
    //
    public Alquiler() {
    }

    //
    //  Getters & setters
    //
    public Long getId_alquiler() {
        return id_alquiler;
    }
    public void setId_alquiler(Long id_alquiler) {
        this.id_alquiler = id_alquiler;
    }
    public Date getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public Date getFecha_estimada_devolucion() {
        return fecha_estimada_devolucion;
    }
    public void setFecha_estimada_devolucion(Date fecha_estimada_devolucion) {
        this.fecha_estimada_devolucion = fecha_estimada_devolucion;
    }
    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }
    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
    public Sucursal getDestino() {
        return destino;
    }
    public void setDestino(Sucursal destino) {
        this.destino = destino;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getOrigen() {
        return origen;
    }

    public void setOrigen(Sucursal origen) {
        this.origen = origen;
    }
}
