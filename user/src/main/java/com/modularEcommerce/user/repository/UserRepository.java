package com.modularEcommerce.user.repository;

import com.modularEcommerce.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
