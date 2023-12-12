package soapws.impl;

import dao.factory.SucursalDAOFactory;
import dao.factory.FactoryTypeEnum;
import dao.interf.ISucursalDAO;
import exception.DAOTypeException;
import javax.jws.WebService;
import soapws.interf.ISucursalSOAP;
import struct.Sucursal;

import java.util.List;

@WebService(endpointInterface = "soapws.interf.ISucursalSOAP", serviceName = "SucursalSOAP")
public class SucursalSOAPImpl implements ISucursalSOAP {

    private ISucursalDAO sucursalDAO;

    public SucursalSOAPImpl() {
        try {
            this.sucursalDAO = SucursalDAOFactory.getImpl(FactoryTypeEnum.HIBERNATE);
        } catch(DAOTypeException daoTypeException) {
            System.exit(1);
        }
    }

    @Override
    public Integer createSucursal(Sucursal sucursal) {
        return sucursalDAO.createSucursal(sucursal);
    }

    @Override
    public Sucursal readSucursalById(Long id_sucursal) {
        return sucursalDAO.readSucursalById(id_sucursal);
    }

    @Override
    public List<Sucursal> readAllSucursal() {
        return sucursalDAO.readAllSucursal();
    }

    @Override
    public Integer updateSucursal(Sucursal sucursal) {
        return sucursalDAO.updateSucursal(sucursal);
    }

    @Override
    public Integer deleteSucursal(Sucursal sucursal) {
        return sucursalDAO.deleteSucursal(sucursal);
    }
}
