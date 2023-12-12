package dao.factory;

import dao.impl.ClienteDAOImpl;
import exception.DAOTypeException;

public abstract class ClienteDAOFactory {

    public static ClienteDAOImpl getImpl(FactoryTypeEnum type) throws DAOTypeException {
        if(type.equals(FactoryTypeEnum.HIBERNATE)) {
            return new ClienteDAOImpl();
        }
        throw new DAOTypeException("dao.factory.ClienteDAOFactory", "8");
    }
}
