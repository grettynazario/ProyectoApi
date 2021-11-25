package ar.fi.uba.aninfo.proyecto.api.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.fi.uba.aninfo.proyecto.api.model.Project;
import ar.fi.uba.aninfo.proyecto.api.persistencia.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
    ProjectRepository projectRepository;
	
	public ArrayList<Project> getProjects(){
        return (ArrayList<Project>) projectRepository.findAll();
    }

    public Project saveProject(Project usuario){
        return projectRepository.save(usuario);
    }

    public Project getById(Long id){
        return projectRepository.findOne(id);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            projectRepository.delete(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
