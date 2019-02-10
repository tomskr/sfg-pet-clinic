package tomas.home.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tomas.home.sfgpetclinic.model.Owner;
import tomas.home.sfgpetclinic.model.PetType;
import tomas.home.sfgpetclinic.model.Vet;
import tomas.home.sfgpetclinic.services.OwnerServices;
import tomas.home.sfgpetclinic.services.PetTypeService;
import tomas.home.sfgpetclinic.services.VetServices;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerServices ownerServices;
    private final VetServices vetServices;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerServices ownerServices, VetServices vetServices, PetTypeService petTypeService){
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


    Owner owner1 = new Owner();
    owner1.setFirstName("Michael");
    owner1.setLastName("Weston");

    ownerServices.save(owner1);

    Owner owner2 = new Owner();
    owner2.setFirstName("Fiona");
    owner2.setLastName("Glenanne");

    ownerServices.save(owner2);

    System.out.println("Loaded Owners...");

    Vet vet1 = new Vet();
    vet1.setFirstName("Sam");
    vet1.setLastName("Axe");

    vetServices.save(vet1);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jesie");
    vet2.setLastName("Porter");

    vetServices.save(vet2);

    System.out.println("Loaded Vets...");
    }
}
