package org.furkan.marriageuxproject.service.query;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.model.Gift;
import org.furkan.marriageuxproject.repository.GiftRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class GiftQueryHandler {

    private final GiftRepository giftRepository;

    @Cacheable(key = "#giftId", value = "gift")
    public Optional<Gift> get(UUID giftId) {
        return giftRepository.findById(giftId);
    }
}
