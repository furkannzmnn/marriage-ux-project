package org.furkan.marriageuxproject.api;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.UserCommand;
import org.furkan.marriageuxproject.service.command.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserCommandController {

    private final UserService userService;

    @PostMapping
    public void createUser(@RequestBody UserCommand user) {
        userService.createUser(user);
    }
}
