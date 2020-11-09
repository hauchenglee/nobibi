package com.nobibi.nobibicore.service;

import com.nobibi.nobibicore.model.Demo;

import java.util.Optional;

public interface DemoService {

    Optional<Demo> findById(String id);
}
