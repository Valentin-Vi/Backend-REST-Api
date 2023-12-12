package dao.factory;

import dao.impl.SucursalDAOImpl;
import exception.DAOTypeException;

public abstract class SucursalDAOFactory {

    public static SucursalDAOImpl getImpl(FactoryTypeEnum type) throws DAOTypeException {
        if(type.equals(FactoryTypeEnum.HIBERNATE)) {
            return new SucursalDAOImpl();
        }
        throw new DAOTypeException("dao.factory.SucursalDAOFactory", "8");
    }
}
