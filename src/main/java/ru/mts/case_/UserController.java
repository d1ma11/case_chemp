package ru.mts.case_;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{stringLike}")
    public List<User> getUsersContainingString(@PathVariable(name = "stringLike") String stringLike) {
        return userService.findAllUsersContainingUsername(stringLike);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
