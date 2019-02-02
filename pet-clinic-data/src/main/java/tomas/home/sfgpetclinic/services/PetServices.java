package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetServices {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
