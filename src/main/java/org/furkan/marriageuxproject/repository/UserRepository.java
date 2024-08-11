package org.furkan.marriageuxproject.repository;

import org.furkan.marriageuxproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
