package com.nobibi.nobibicore.dao.mysql;

import com.nobibi.nobibicore.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoMySqlDao extends JpaRepository<Demo, String> {
}
