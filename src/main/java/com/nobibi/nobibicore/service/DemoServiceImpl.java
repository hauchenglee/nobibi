package com.nobibi.nobibicore.service;

import com.nobibi.nobibicore.dao.DemoDao;
import com.nobibi.nobibicore.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public Optional<Demo> findById(String id) {
        return demoDao.findById(id);
    }

    @Override
    public void save(Demo demo) {
        demoDao.save(demo);
    }
}
