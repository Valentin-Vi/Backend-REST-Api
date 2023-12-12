package dao.factory;

import dao.impl.VehiculoDAOImpl;
import exception.DAOTypeException;

public abstract class VehiculoDAOFactory {

    public static VehiculoDAOImpl getImpl(FactoryTypeEnum type) throws DAOTypeException {
        if(type.equals(FactoryTypeEnum.HIBERNATE)) {
            return new VehiculoDAOImpl();
        }
        throw new DAOTypeException("dao.factory.VehiculoDAOFactory", "8");
    }
}
