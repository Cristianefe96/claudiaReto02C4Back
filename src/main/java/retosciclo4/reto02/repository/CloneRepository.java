package retosciclo4.reto02.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import retosciclo4.reto02.interfaces.InterfaceCloneEq;
import retosciclo4.reto02.model.Clone;

@Repository
public class CloneRepository {
    @Autowired
    private InterfaceCloneEq repository;

    public List<Clone> getAll() {
        return repository.findAll();
    }

    public Optional<Clone> getCloneEq(Integer id) {
        return repository.findById(id);
    }
    
    public Clone create(Clone cloneEq) {
        return repository.save(cloneEq);
    }

    public void update(Clone cloneEq) {
        repository.save(cloneEq);
    }
    
    public void delete(Clone cloneEq) {
        repository.delete(cloneEq);
    }
}

