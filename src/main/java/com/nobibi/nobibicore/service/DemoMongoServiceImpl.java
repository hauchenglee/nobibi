package com.nobibi.nobibicore.service;

import com.nobibi.nobibicore.dao.mongo.DemoMongoDao;
import com.nobibi.nobibicore.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoMongoServiceImpl implements DemoService {
    @Autowired
    private DemoMongoDao demoMongoDao;

    @Override
    public Optional<Demo> findById(String id) {
        return demoMongoDao.findById(id);
    }

    @Override
    public void save(Demo demo) {
        demoMongoDao.save(demo);
    }
}
