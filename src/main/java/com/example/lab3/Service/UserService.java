package com.example.lab3.Service;

import com.example.lab3.Dto.CreateUpdateUserDto;
import com.example.lab3.Dto.UserDto;
import com.example.lab3.Entity.User;
import com.example.lab3.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserDto create(CreateUpdateUserDto createUpdateUserDto) {
        var entity = new User(
                UUID.randomUUID().toString(),
                createUpdateUserDto.getCreateDate(),
                createUpdateUserDto.getEditDate(),
                createUpdateUserDto.getFullName(),
                createUpdateUserDto.getLogin(),
                createUpdateUserDto.getPassword(),
                createUpdateUserDto.getRole());
        var savedEntity = userRepository.save(entity);
        return new UserDto(
                savedEntity.getId(),
                savedEntity.getCreateDate(),
                savedEntity.getEditDate(),
                savedEntity.getFullName(),
                savedEntity.getLogin(),
                savedEntity.getPassword(),
                savedEntity.getRole()
        );
    }

    public UserDto getData(CreateUpdateUserDto createUpdateUserDto) {
        var entity = new User(
                UUID.randomUUID().toString(),
                createUpdateUserDto.getCreateDate(),
                createUpdateUserDto.getEditDate(),
                createUpdateUserDto.getFullName(),
                createUpdateUserDto.getLogin(),
                createUpdateUserDto.getPassword(),
                createUpdateUserDto.getRole());
        return new UserDto(
                entity.getId(),
                entity.getCreateDate(),
                entity.getEditDate(),
                entity.getFullName(),
                entity.getLogin(),
                entity.getPassword(),
                entity.getRole()
        );
    }
}
