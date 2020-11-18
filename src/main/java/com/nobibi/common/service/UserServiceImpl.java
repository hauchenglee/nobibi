package com.nobibi.common.service;

import com.nobibi.nobibicore.dao.mysql.UserDao;
import com.nobibi.nobibicore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Optional<User> findById(String id) {
        return userDao.findById(id);
    }
}
