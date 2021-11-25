package ar.fi.uba.aninfo.proyecto.api.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.fi.uba.aninfo.proyecto.api.model.Tarea;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long>{

}
