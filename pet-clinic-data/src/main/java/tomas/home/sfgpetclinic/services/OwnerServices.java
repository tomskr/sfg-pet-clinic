package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Owner;

public interface OwnerServices extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
