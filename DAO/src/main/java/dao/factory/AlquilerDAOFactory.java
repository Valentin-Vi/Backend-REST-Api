package dao.factory;

import dao.impl.AlquilerDAOImpl;
import exception.DAOTypeException;

public abstract class AlquilerDAOFactory {

    public static AlquilerDAOImpl getImpl(FactoryTypeEnum type) throws DAOTypeException {
        if(type.equals(FactoryTypeEnum.HIBERNATE)) {
            return new AlquilerDAOImpl();
        }
        throw new DAOTypeException("dao.factory.AlquilerDAOFactory", "8");
    }
}
