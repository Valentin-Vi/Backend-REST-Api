package exception;

public class DAOTypeException extends Exception {
    public DAOTypeException() {}

    public DAOTypeException(String path, String line) {
        super("\nDAOTypeException: El tipo de dao ingresado no se encontro.\nat " + path + " [ln" + line + "].");
    }
}
