package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
