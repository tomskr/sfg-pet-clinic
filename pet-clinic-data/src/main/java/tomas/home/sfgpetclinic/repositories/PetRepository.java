package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
