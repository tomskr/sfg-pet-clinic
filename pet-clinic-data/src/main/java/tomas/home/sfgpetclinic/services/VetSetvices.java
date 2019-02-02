package tomas.home.sfgpetclinic.services;

import tomas.home.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetSetvices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
