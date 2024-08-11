package org.furkan.marriageuxproject.dto.command;

import java.time.LocalDateTime;
import java.util.List;

public record WeddingCreateCommand(
        String name,
        LocalDateTime weddingDate,
        List<GuestAttachCommand> existingGuests
) {
}
