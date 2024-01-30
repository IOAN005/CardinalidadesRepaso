package com.corenetworks.CardinalidadesRepaso.controlador;

import com.corenetworks.CardinalidadesRepaso.modelo.Editorial;
import com.corenetworks.CardinalidadesRepaso.repository.IEditorialRepo;
import com.corenetworks.CardinalidadesRepaso.service.IEditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoriales")
public class EditorialControlador {
    @Autowired
    private IEditorialService service;
    @PostMapping
    public Editorial create(@RequestBody  Editorial e){
        return service.create(e);
    }
    @GetMapping
    public List<Editorial>consultarTodos(){
        return service.consultarTodos();
    }
    @PutMapping
    public Editorial modificar(@RequestBody Editorial e){
        return service.modificar(e);
    }
    @DeleteMapping("/{id}")
    void  elimimnar(@PathVariable(name = "id") int id){
        service.eliminar(id);
    }
    @RequestMapping("/{id}")
    public Editorial consultarUno(@PathVariable(name = "id") int id){
        return service.consultarUno(id);
    }
    @GetMapping("/filtro/{direccion}")
    public List<Editorial>filtroPorDireccion(@PathVariable(name = "direccion") String direccion){
        return service.filtroPorDireccion(direccion);


    }
    @GetMapping("/filtro2/{nombre}")
    public List<Editorial>filtroPorNombre(@PathVariable(name = "nombre") String nombre ){
        return service.filtroPorNombre(nombre);
    }

}
