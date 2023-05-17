package com.example.lab3.Dto;

import com.example.lab3.Entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private Date createDate;
    private Date editDate;
    private String fullName;
    private String login;
    private String password;
    private Role role;
}
