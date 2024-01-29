package com.corenetworks.CardinalidadesRepaso.service;

import com.corenetworks.CardinalidadesRepaso.modelo.Editorial;

import java.util.List;

public interface IEditorialService {
    Editorial create(Editorial e);
    Editorial modificar(Editorial e);
    void eliminar(int id);
    Editorial consultarUno(int id);
    List<Editorial> consultarTodos();




}
