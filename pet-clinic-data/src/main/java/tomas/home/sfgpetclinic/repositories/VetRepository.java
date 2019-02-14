package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
