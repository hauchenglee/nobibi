package com.nobibi.nobibicore.dao.mysql;

import com.nobibi.nobibicore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, String> {

    Optional<User> findById(String id);

    @Query("SELECT u FROM User u WHERE u.user_uuid = :uuid")
    Optional<User> findByUser_uuid(@Param("uuid") String uuid);
}
