package dao.interf;

import java.util.Date;
import java.util.List;

public interface IHQLDAO {
    public List<Object> punto1(Long id_sucursal, Date fecha_estimamda_devolucion);
    public List<Object> punto2(String cliente_dni);
    public List<Object> punto3(Long id_sucursal);
    public List<Object> punto4(Long id_sucursal);
    public List<Object> punto5(String vehiculo_tipo, Date fecha_incio, Date fecha_final);
}
