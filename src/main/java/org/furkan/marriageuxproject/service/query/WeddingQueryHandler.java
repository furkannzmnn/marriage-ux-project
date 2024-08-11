package org.furkan.marriageuxproject.service.query;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.model.Wedding;
import org.furkan.marriageuxproject.repository.WeddingRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class WeddingQueryHandler {

    private final WeddingRepository weddingRepository;

    @Cacheable(key = "#weddingId", value = "wedding")
    public Optional<Wedding> getWeddingById(UUID weddingId) {
        return weddingRepository.findById(weddingId);
    }
}
