package org.furkan.marriageuxproject.dto.command;

import java.math.BigDecimal;
import java.util.UUID;

public record WeddingAttachCreateCommand(
        UUID weddingId,
        UUID guestId,
        UUID giftId,
        BigDecimal giftAmount
) {
}
