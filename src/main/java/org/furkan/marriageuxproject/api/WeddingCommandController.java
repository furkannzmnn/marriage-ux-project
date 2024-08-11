package org.furkan.marriageuxproject.api;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.WeddingCreateCommand;
import org.furkan.marriageuxproject.service.command.WeddingCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class WeddingCommandController {

    private final WeddingCommandHandler weddingCommandHandler;

    @PostMapping
    public void createWedding(@RequestBody WeddingCreateCommand weddingCreateCommand) {
        weddingCommandHandler.createWedding(weddingCreateCommand);
    }
}
