package struct;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(
        name = "sucursales"
)
public class Sucursal implements Serializable {

    //
    //  Id
    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //
    //  Attributes
    //
    private Long id_sucursal;
    private String nombre;
    private String direccion;

    @OneToMany(
            mappedBy = "sucursal",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "sucursal_vehiculos",
            joinColumns = @JoinColumn(name = "id_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "id_vehiculo")
    )
    private List<Vehiculo> vehiculoList;

    @OneToMany(
            mappedBy = "sucursal",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "sucursal_alquileres",
            joinColumns = @JoinColumn(name = "id_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "id_alquiler")
    )
    private List<Alquiler> alquilerList;

    @OneToMany(
            mappedBy = "sucursal",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "sucursal_alquileresDestino",
            joinColumns = @JoinColumn(name = "id_sucursal"),
            inverseJoinColumns = @JoinColumn(name = "id_alquilerDestino")
    )
    private List<Alquiler> alquilerDestino;

    //
    //  Default constructor
    //
    public Sucursal() {
    }

    //
    //  Getters & setters
    //
    public Long getId_sucursal() {
        return id_sucursal;
    }
    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Vehiculo> getVehiculoList() {
        return vehiculoList;
    }
    public void setVehiculoList(List<Vehiculo> vehiculoList) {
        this.vehiculoList = vehiculoList;
    }
    public List<Alquiler> getAlquilerList() {
        return alquilerList;
    }
    public void setAlquilerList(List<Alquiler> alquilerList) {
        this.alquilerList = alquilerList;
    }

    public List<Alquiler> getAlquilerDestino() {
        return alquilerDestino;
    }

    public void setAlquilerDestino(List<Alquiler> alquilerDestino) {
        this.alquilerDestino = alquilerDestino;
    }
}
