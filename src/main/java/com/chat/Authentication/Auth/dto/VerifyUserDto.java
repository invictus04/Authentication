package com.chat.Authentication.Auth.dto;


import lombok.Data;

@Data
public class VerifyUserDto {
    private String email;
    private String verification;
}
