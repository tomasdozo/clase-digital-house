package com.dozo.wallet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable int id) {
        return switch (id) {
            case 1 -> ResponseEntity.ok(new UserDto(1, "Tomás Dozo", 0.1));
            case 2 -> ResponseEntity.ok(new UserDto(2, "Steve Jobs", 324.123));
            case 3 -> ResponseEntity.ok(new UserDto(31, "Elon Musk", 654.1));
            default -> ResponseEntity.badRequest().body(null);
        };

    }
}
