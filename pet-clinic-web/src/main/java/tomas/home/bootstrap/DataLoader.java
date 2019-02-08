package tomas.home.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tomas.home.sfgpetclinic.model.Owner;
import tomas.home.sfgpetclinic.model.Vet;
import tomas.home.sfgpetclinic.services.OwnerServices;
import tomas.home.sfgpetclinic.services.VetServices;

@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerServices ownerServices;

    private final VetServices vetServices;

    @Autowired
    public DataLoader(OwnerServices ownerServices, VetServices vetServices){
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
    }

    @Override
    public void run(String... args) throws Exception {
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
