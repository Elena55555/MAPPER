package com.sky.MAPPER2.service;

import com.sky.MAPPER2.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
