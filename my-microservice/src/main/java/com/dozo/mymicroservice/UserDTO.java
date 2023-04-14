package com.dozo.mymicroservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String username;
    private String cryptoCoin;
    private double cryptoAmount;
    private double USDValue;

}
