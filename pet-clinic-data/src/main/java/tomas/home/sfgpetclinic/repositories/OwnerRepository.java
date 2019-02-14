package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
