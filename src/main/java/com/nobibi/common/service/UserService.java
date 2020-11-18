package com.nobibi.common.service;

import com.nobibi.nobibicore.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findById(String id);
}

