package com.dozo.wallet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private int id;
    private String name;
    private double bitcoins;
}
