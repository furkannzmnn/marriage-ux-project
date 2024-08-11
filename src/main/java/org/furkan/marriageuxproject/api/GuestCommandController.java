package org.furkan.marriageuxproject.api;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.GuestCreateCommand;
import org.furkan.marriageuxproject.service.command.GuestCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class GuestCommandController {

    private final GuestCommandHandler guestCommandHandler;

    @PostMapping
    public void createGuest(@RequestBody GuestCreateCommand guestCreateCommand) {
        guestCommandHandler.createGuest(guestCreateCommand);
    }
}
