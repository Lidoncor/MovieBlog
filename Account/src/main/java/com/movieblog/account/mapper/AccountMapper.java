package com.movieblog.account.mapper;

import com.movieblog.account.dto.SignUpDto;
import com.movieblog.account.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AccountMapper {

    @Mapping(target = "id", ignore = true)
    User signUpDtoToUser(SignUpDto signUpDto);
}
