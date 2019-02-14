package tomas.home.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import tomas.home.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
