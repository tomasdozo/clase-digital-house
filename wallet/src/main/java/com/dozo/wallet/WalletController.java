package com.dozo.wallet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @GetMapping("/wallets/{id}")
    public ResponseEntity<WalletDTO> getUser(@PathVariable int id) {
        return switch (id) {
            case 1 -> ResponseEntity.ok(new WalletDTO(1, "Tomás Dozo", 3,25.3));
            case 2 -> ResponseEntity.ok(new WalletDTO(2, "Steve Jobs", 2,3240.123));
            case 3 -> ResponseEntity.ok(new WalletDTO(31, "Elon Musk",1 ,654.1));
            default -> ResponseEntity.badRequest().body(null);
        };

    }
}
