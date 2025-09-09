package com.mmapula.flightreservation.repositories;

import com.mmapula.flightreservation.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
