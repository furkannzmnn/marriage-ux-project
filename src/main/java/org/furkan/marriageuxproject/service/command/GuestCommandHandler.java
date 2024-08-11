package org.furkan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.GuestCreateCommand;
import org.furkan.marriageuxproject.repository.GuestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class GuestCommandHandler {

    private final GuestRepository guestRepository;

    public void createGuest(GuestCreateCommand guestCreateCommand) {
        guestRepository.save(guestCreateCommand.toGuest());
    }
}
