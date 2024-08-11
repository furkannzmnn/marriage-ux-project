package org.furkan.marriageuxproject.dto.command;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.furkan.marriageuxproject.model.User;

public record UserCommand(
        String name,
        String surname
) {
    public User toUser() {
        return User.builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
