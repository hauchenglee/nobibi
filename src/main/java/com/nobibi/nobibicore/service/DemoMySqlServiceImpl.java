package com.nobibi.nobibicore.service;

import com.nobibi.nobibicore.dao.mysql.DemoMySqlDao;
import com.nobibi.nobibicore.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class DemoMySqlServiceImpl implements DemoService {

    @Autowired
    private DemoMySqlDao DemoMySqlDao;

    @Override
    public Optional<Demo> findById(String id) {
        return DemoMySqlDao.findById(id);
    }

    @Override
    public void save(Demo demo) {
        DemoMySqlDao.save(demo);
    }
}
