package com.corenetworks.CardinalidadesRepaso.service;

import com.corenetworks.CardinalidadesRepaso.modelo.Editorial;
import com.corenetworks.CardinalidadesRepaso.modelo.Libro;
import com.corenetworks.CardinalidadesRepaso.repository.IEditorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EditorialService implements IEditorialService{
    @Autowired
    private IEditorialRepo repoService;
    @Override
    public Editorial create(Editorial e) {
        for(Libro elemento:e.getLibros()){
            elemento.setEditorial(e);
        }
        return repoService.save(e);
    }

    @Override
    public Editorial modificar(Editorial e) {
        for(Libro elemento:e.getLibros()){
            elemento.setEditorial(e);
        }
        return repoService.save(e);
    }

    @Override
    public void eliminar(int id) {
    repoService.deleteById(id);
    }

    @Override
    public Editorial consultarUno(int id) {
        return repoService.findById(id).orElse(new Editorial());
    }

    @Override
    public List<Editorial> consultarTodos() {
        return repoService.findAll();
    }

    @Override
    public List<Editorial> filtroPorDireccion(String direccion) {
        return repoService.filtroPorDireccion(direccion);
    }

    @Override
    public List<Editorial> filtroPorNombre(String nombre) {
        return repoService.filtroPorNombre(nombre);
    }
}
