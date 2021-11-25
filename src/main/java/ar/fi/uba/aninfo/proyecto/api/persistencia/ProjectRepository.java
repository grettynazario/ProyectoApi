package ar.fi.uba.aninfo.proyecto.api.persistencia;

import org.springframework.stereotype.Repository;
import ar.fi.uba.aninfo.proyecto.api.model.Project;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    //public abstract ArrayList<Project> findByPrioridad(Integer prioridad);

}
