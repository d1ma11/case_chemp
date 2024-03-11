package ru.mts.case_;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsersContainingUsername(String stringLike) {
        return userRepository.findUsersByUsernameContaining(stringLike);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
