package org.furkan.marriageuxproject.repository;

import org.furkan.marriageuxproject.model.Gift;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GiftRepository extends JpaRepository<Gift, UUID> {
}
