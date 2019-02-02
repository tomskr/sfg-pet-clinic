package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Owner;

public interface OvnerServices extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
