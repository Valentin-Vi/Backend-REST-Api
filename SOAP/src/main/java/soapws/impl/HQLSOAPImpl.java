package soapws.impl;

import dao.factory.FactoryTypeEnum;
import dao.factory.HQLDAOFactory;
import dao.interf.IHQLDAO;
import exception.DAOTypeException;
import javax.jws.WebService;
import soapws.interf.IHQLSOAP;

import java.util.Date;
import java.util.List;

@WebService(endpointInterface = "soapws.interf.IHQLSOAP", serviceName = "HQLSOAP")
public class HQLSOAPImpl implements IHQLSOAP {

    private IHQLDAO hqlDAO;

    public HQLSOAPImpl() {
        try {
            this.hqlDAO = HQLDAOFactory.getImpl(FactoryTypeEnum.HIBERNATE);
        } catch(DAOTypeException daoTypeException) {
            System.exit(1);
        }
    }


    @Override
    public List<Object> punto1(Long id_sucursal, Date fecha_estimamda_devolucion) {
        return hqlDAO.punto1(id_sucursal, fecha_estimamda_devolucion);
    }

    @Override
    public List<Object> punto2(String cliente_dni) {
        return hqlDAO.punto2(cliente_dni);
    }

    @Override
    public List<Object> punto3(Long id_sucursal) {
        return hqlDAO.punto3(id_sucursal);
    }

    @Override
    public List<Object> punto4(Long id_sucursal) {
        return hqlDAO.punto4(id_sucursal);
    }

    @Override
    public List<Object> punto5(String vehiculo_tipo, Date fecha_incio, Date fecha_final) {
        return hqlDAO.punto5(vehiculo_tipo, fecha_incio, fecha_final);
    }
}
