package com.dozo.wallet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WalletDTO {
    private int id;
    private String username;
    private int coinId;
    private double amount;
}
