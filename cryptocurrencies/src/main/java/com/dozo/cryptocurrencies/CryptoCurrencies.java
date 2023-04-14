package com.dozo.cryptocurrencies;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CryptoCurrencies {

    @GetMapping("/crypto/{id}")
    public ResponseEntity<CryptoValueDTO> getUser(@PathVariable int id) {
        return switch (id) {
            case 1 -> ResponseEntity.ok(new CryptoValueDTO(1, "Bitcoin", 30709.20));
            case 2 -> ResponseEntity.ok(new CryptoValueDTO(2, "Ethereum", 2099.90));
            case 3 -> ResponseEntity.ok(new CryptoValueDTO(31, "DogeCoin", 0.08848));
            default -> ResponseEntity.badRequest().body(null);
        };

    }
}
