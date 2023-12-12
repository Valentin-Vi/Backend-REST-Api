package soapws.impl;

import dao.factory.VehiculoDAOFactory;
import dao.factory.FactoryTypeEnum;
import dao.interf.IVehiculoDAO;
import exception.DAOTypeException;
import javax.jws.WebService;
import soapws.interf.IVehiculoSOAP;
import struct.Vehiculo;

import java.util.List;

@WebService(endpointInterface = "soapws.interf.IVehiculoSOAP", serviceName = "VehiculoSOAP")
public class VehiculoSOAPImpl implements IVehiculoSOAP {

    private IVehiculoDAO vehiculoDAO;

    public VehiculoSOAPImpl() {
        try {
            this.vehiculoDAO = VehiculoDAOFactory.getImpl(FactoryTypeEnum.HIBERNATE);
        } catch(DAOTypeException daoTypeException) {
            System.exit(1);
        }
    }

    @Override
    public Integer createVehiculo(Vehiculo vehiculo) {
        return vehiculoDAO.createVehiculo(vehiculo);
    }

    @Override
    public Vehiculo readVehiculoById(Long id_vehiculo) {
        return vehiculoDAO.readVehiculoById(id_vehiculo);
    }

    @Override
    public List<Vehiculo> readAllVehiculo() {
        return vehiculoDAO.readAllVehiculo();
    }

    @Override
    public Integer updateVehiculo(Vehiculo vehiculo) {
        return vehiculoDAO.updateVehiculo(vehiculo);
    }

    @Override
    public Integer deleteVehiculo(Vehiculo vehiculo) {
        return vehiculoDAO.deleteVehiculo(vehiculo);
    }
}
