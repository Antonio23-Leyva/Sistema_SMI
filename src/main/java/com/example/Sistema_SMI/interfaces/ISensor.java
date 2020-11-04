package com.example.Sistema_SMI.interfaces;

import com.example.Sistema_SMI.modelo.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISensor extends CrudRepository<Sensor, Integer> {


}
