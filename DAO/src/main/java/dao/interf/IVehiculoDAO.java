package dao.interf;

import struct.Vehiculo;

import java.util.List;

public interface IVehiculoDAO {
    public Integer createVehiculo(Vehiculo vehiculo);
    public Vehiculo readVehiculoById(Long id_vehiculo);
    public List<Vehiculo> readAllVehiculo();
    public Integer updateVehiculo(Vehiculo vehiculo);
    public Integer deleteVehiculo(Vehiculo vehiculo);
}
