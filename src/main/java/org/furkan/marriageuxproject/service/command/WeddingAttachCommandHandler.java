package org.furkan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.WeddingAttachCreateCommand;
import org.furkan.marriageuxproject.model.Gift;
import org.furkan.marriageuxproject.model.Wedding;
import org.furkan.marriageuxproject.model.WeddingGuest;
import org.furkan.marriageuxproject.service.query.GiftQueryHandler;
import org.furkan.marriageuxproject.service.query.WeddingQueryHandler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeddingAttachCommandHandler {

    private final WeddingQueryHandler weddingQueryHandler;
    private final GiftQueryHandler giftQueryHandler;

    @Transactional
    public void createWeddingAttach(WeddingAttachCreateCommand weddingAttachCreateCommand) {

        UUID weddingId = weddingAttachCreateCommand.weddingId();
        UUID guestId = weddingAttachCreateCommand.guestId();
        UUID giftId = weddingAttachCreateCommand.giftId();
        BigDecimal giftAmount = weddingAttachCreateCommand.giftAmount();

        Wedding wedding = weddingQueryHandler.getWeddingById(weddingId).orElseThrow(() -> new RuntimeException("Wedding Not Found"));

        wedding.getWeddingGuests()
                .stream()
                .filter(weddingGuest -> weddingGuest.getGuest().getId().equals(guestId))
                .findFirst()
                .ifPresent(weddingGuest -> {
                    Gift gift = giftQueryHandler.get(giftId).orElseThrow(() -> new RuntimeException("Gift Not Found"));
                    weddingGuest.setGift(gift);
                    weddingGuest.setAmount(giftAmount);
                });
    }
}
