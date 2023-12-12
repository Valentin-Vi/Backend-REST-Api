package dao.interf;

import struct.Sucursal;

import java.util.List;

public interface ISucursalDAO {
    public Integer createSucursal(Sucursal sucursal);
    public Sucursal readSucursalById(Long id_sucursal);
    public List<Sucursal> readAllSucursal();
    public Integer updateSucursal(Sucursal sucursal);
    public Integer deleteSucursal(Sucursal sucursal);
}
