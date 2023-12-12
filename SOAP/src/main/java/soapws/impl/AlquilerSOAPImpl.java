package soapws.impl;

import dao.factory.AlquilerDAOFactory;
import dao.factory.FactoryTypeEnum;
import dao.interf.IAlquilerDAO;
import exception.DAOTypeException;
import javax.jws.WebService;
import soapws.interf.IAlquilerSOAP;
import struct.Alquiler;

import java.util.List;

@WebService(endpointInterface = "soapws.interf.IAlquilerSOAP", serviceName = "AlquilerSOAP")
public class AlquilerSOAPImpl implements IAlquilerSOAP {

    private IAlquilerDAO alquilerDAO;

    public AlquilerSOAPImpl() {
        try {
            this.alquilerDAO = AlquilerDAOFactory.getImpl(FactoryTypeEnum.HIBERNATE);
        } catch(DAOTypeException daoTypeException) {
            System.exit(1);
        }
    }

    @Override
    public Integer createAlquiler(Alquiler alquiler) {
        return alquilerDAO.createAlquiler(alquiler);
    }

    @Override
    public Alquiler readAlquilerById(Long id_alquiler) {
        return alquilerDAO.readAlquilerById(id_alquiler);
    }

    @Override
    public List<Alquiler> readAllAlquiler() {
        return alquilerDAO.readAllAlquiler();
    }

    @Override
    public Integer updateAlquiler(Alquiler alquiler) {
        return alquilerDAO.updateAlquiler(alquiler);
    }

    @Override
    public Integer deleteAlquiler(Alquiler alquiler) {
        return alquilerDAO.deleteAlquiler(alquiler);
    }
}
