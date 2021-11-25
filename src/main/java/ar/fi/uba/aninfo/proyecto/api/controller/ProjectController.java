package ar.fi.uba.aninfo.proyecto.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import ar.fi.uba.aninfo.proyecto.api.model.Project;
import ar.fi.uba.aninfo.proyecto.api.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
    ProjectService projectService;

	@RequestMapping(method = RequestMethod.GET)
    public ArrayList<Project> getProjects(){
        return projectService.getProjects();
    }
    
	@RequestMapping(method = RequestMethod.POST)
    public Project saveProject(@RequestBody Project project){
        return this.projectService.saveProject(project);
    }

	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public Project getById(@PathVariable("id") Long id) {
        return this.projectService.getById(id);
    }
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.projectService.eliminarUsuario(id);
        if (ok){
            return "Se elimina el proyecto con id: " + id;
        }else{
            return "No pudo eliminar el proyecto con id: " + id;
        }
    }
}
