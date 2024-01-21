package com.sky.MAPPER2.mapper;

import com.sky.MAPPER2.entity.User;
import com.sky.MAPPER2.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);


    User mapToUser(UserDto userDto);

    UserDto mapToUserDto(User savedUser);
}
