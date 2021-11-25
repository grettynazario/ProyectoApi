package ar.fi.uba.aninfo.proyecto.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.fi.uba.aninfo.proyecto.api.model.Tarea;
import ar.fi.uba.aninfo.proyecto.api.service.TareaService;

@RestController
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
    TareaService tareaService;

	@RequestMapping(method = RequestMethod.GET)
    public ArrayList<Tarea> getTareas(){
        return tareaService.getTareas();
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public Tarea saveTarea(@RequestBody Tarea tarea){
        return this.tareaService.save(tarea);
    }

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Tarea getById(@PathVariable("id") Long id) {
        return this.tareaService.getById(id);
    }
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.tareaService.deleteTarea(id);
        if (ok){
            return "Se elimina la tarea con id: " + id;
        }else{
            return "No pudo eliminar la tarea con id: " + id;
        }
    }

}
