package com.dozo.mymicroservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)

public class WalletDTO {
    private int id;
    private String username;
    private int coinId;
    private double amount;
}
