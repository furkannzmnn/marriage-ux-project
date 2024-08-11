package org.furkan.marriageuxproject.dto.command;

import org.furkan.marriageuxproject.model.Gift;
import org.furkan.marriageuxproject.model.GiftType;

public record GiftCreateCommand(
        String parentName,
        String imageUrl,
        GiftType giftType
) {
    public Gift toGift() {
        return Gift.builder()
                .giftType(giftType)
                .name(parentName)
                .build();
    }
}
