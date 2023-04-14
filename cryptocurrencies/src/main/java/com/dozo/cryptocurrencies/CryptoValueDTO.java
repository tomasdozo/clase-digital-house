package com.dozo.cryptocurrencies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CryptoValueDTO {
    private int id;
    private String name;
    private double value;
}
