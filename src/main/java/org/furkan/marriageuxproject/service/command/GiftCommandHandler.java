package org.furkan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.GiftCreateCommand;
import org.furkan.marriageuxproject.repository.GiftRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GiftCommandHandler {
    private final GiftRepository giftRepository;

    public void createGift(GiftCreateCommand giftCreateCommand) {
        giftRepository.save(giftCreateCommand.toGift());
    }
}
