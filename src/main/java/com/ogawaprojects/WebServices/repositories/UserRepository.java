package com.ogawaprojects.WebServices.repositories;

import com.ogawaprojects.WebServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
