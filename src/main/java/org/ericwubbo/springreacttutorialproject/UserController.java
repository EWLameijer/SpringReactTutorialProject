package org.ericwubbo.springreacttutorialproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

// step_6
@RestController
@CrossOrigin
@RequestMapping("/api/v1/register")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    record UserData(String username, String password) {}

    @GetMapping
    public String getTest() { return "Test!"; }

    @PostMapping
    public String register(@RequestBody UserData userData) {
        userRepository.save(new User(userData.username, userData.password));
        return "You have registered (or tried to...)";
    }
}
