package com.example.Sistema_SMI.InterfazServicio;

import com.example.Sistema_SMI.modelo.Sensor;

import java.util.List;
import java.util.Optional;

public interface IsensorServicio {
    public List<Sensor>listar(); // Metodo que lista todos los sensores
    public Optional<Sensor> listarId(int id); // Metodo que lista los sensores por id
    public int guardar(Sensor s); // Metodo que guardara los sensores
    public void eliminar(int id); // Metodo que eliminara


}
