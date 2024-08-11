package org.furkan.marriageuxproject.repository;

import org.furkan.marriageuxproject.model.Wedding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WeddingRepository extends JpaRepository<Wedding, UUID> {
}
