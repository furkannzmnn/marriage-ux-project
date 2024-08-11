package org.furkan.marriageuxproject.api;


import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.GiftCreateCommand;
import org.furkan.marriageuxproject.service.command.GiftCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class GiftCommandController {

    private final GiftCommandHandler giftCommandHandler;

    @PostMapping
    public void createGift(@RequestBody GiftCreateCommand giftCreateCommand) {
        giftCommandHandler.createGift(giftCreateCommand);
    }
}
