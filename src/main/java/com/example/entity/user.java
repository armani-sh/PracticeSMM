package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class user {
    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
