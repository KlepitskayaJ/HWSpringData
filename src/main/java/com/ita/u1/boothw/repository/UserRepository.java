package com.ita.u1.boothw.repository;

import com.ita.u1.boothw.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);

    @Query(value = "SELECT u FROM User u")
    List<User> getAllUsers();
}
