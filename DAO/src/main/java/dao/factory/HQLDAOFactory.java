package dao.factory;

import dao.impl.HQLDAOImpl;
import exception.DAOTypeException;

public abstract class HQLDAOFactory {

    public static HQLDAOImpl getImpl(FactoryTypeEnum type) throws DAOTypeException {
        if(type.equals(FactoryTypeEnum.HIBERNATE)) {
            return new HQLDAOImpl();
        }
        throw new DAOTypeException("dao.factory.HQLDAOFactory", "8");
    }
}
