package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
