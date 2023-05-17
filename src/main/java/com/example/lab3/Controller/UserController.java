package com.example.lab3.Controller;

import com.example.lab3.Dto.CreateUpdateUserDto;
import com.example.lab3.Dto.UserDto;
import com.example.lab3.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public UserDto getUser(CreateUpdateUserDto createUpdateUserDto) {
        return userService.getData(createUpdateUserDto);
    }

    @PostMapping
    public UserDto create(@RequestBody CreateUpdateUserDto createUpdateUserDto) {
        return userService.create(createUpdateUserDto);
    }
}
