package com.nobibi.nobibicore.dao;


import com.nobibi.nobibicore.model.Demo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoDao extends MongoRepository<Demo, String> {

    Optional<Demo> findById(String id);


}
