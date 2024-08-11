package org.furkan.marriageuxproject.dto.command;

import org.furkan.marriageuxproject.model.Guest;

public record GuestCreateCommand(
        String name,
        String surname
) {

    public Guest toGuest() {
        return Guest.builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
