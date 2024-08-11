package org.furkan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.furkan.marriageuxproject.dto.command.UserCommand;
import org.furkan.marriageuxproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserCommand user) {
        userRepository.save(user.toUser());
    }
}
