package tomas.home.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import tomas.home.sfgpetclinic.model.Owner;
import tomas.home.sfgpetclinic.services.OwnerServices;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerServices{

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
