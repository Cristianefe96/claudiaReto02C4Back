package retosciclo4.reto02.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import retosciclo4.reto02.model.Clone;

public interface InterfaceCloneEq extends MongoRepository<Clone, Integer>{
    
}
