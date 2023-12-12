package dao.interf;

import struct.Alquiler;

import java.util.List;

public interface IAlquilerDAO {
    public Integer createAlquiler(Alquiler alquiler);
    public Alquiler readAlquilerById(Long id_alquiler);
    public List<Alquiler> readAllAlquiler();
    public Integer updateAlquiler(Alquiler alquiler);
    public Integer deleteAlquiler(Alquiler alquiler);
}
