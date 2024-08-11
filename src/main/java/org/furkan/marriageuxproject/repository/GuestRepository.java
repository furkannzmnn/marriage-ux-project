package org.furkan.marriageuxproject.repository;

import org.furkan.marriageuxproject.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuestRepository extends JpaRepository<Guest, UUID> {
}
