package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OvnerServices {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
