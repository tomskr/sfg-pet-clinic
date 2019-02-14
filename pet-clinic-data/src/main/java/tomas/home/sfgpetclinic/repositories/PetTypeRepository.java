package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
