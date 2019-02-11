package tomas.home.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import tomas.home.sfgpetclinic.model.Speciality;
import tomas.home.sfgpetclinic.services.SpecialitysService;

import java.util.Set;

@Service
public class SpecialitysMapService extends AbstractMapService<Speciality, Long> implements SpecialitysService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

}
