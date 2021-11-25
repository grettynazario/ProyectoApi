package ar.fi.uba.aninfo.proyecto.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.fi.uba.aninfo.proyecto.api.model.Tarea;
import ar.fi.uba.aninfo.proyecto.api.persistencia.TareaRepository;

@Service
public class TareaService {

	 @Autowired
	 TareaRepository tareaRepository;
	 
	 public ArrayList<Tarea> getTareas(){
	        return (ArrayList<Tarea>) tareaRepository.findAll();
	    }

	 public Tarea save(Tarea tarea){
	        return tareaRepository.save(tarea);
	    }

	    public Tarea getById(Long id){
	        return tareaRepository.findOne(id);
	    }

	    public boolean deleteTarea(Long id) {
	        try{
	        	tareaRepository.delete(id);
	            return true;
	        }catch(Exception err){
	            return false;
	        }
	    }
}
