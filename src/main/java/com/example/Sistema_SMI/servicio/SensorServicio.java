package com.example.Sistema_SMI.servicio;

import com.example.Sistema_SMI.InterfazServicio.IsensorServicio;
import com.example.Sistema_SMI.interfaces.ISensor;
import com.example.Sistema_SMI.modelo.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SensorServicio implements IsensorServicio {

    @Autowired
    private ISensor data;
    @Override
    public List<Sensor> listar() {
        return (List<Sensor>)data.findAll();
    }

    @Override
    public Optional<Sensor> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int guardar(Sensor s) {
        return 0;
    }

    @Override
    public void eliminar(int id) {

    }
}
