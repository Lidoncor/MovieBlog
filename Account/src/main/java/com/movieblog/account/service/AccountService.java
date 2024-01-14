package com.movieblog.account.service;

import com.movieblog.account.dto.SignUpDto;
import com.movieblog.account.mapper.AccountMapper;
import com.movieblog.account.model.User;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountMapper accountMapper;

    AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public String signUp(SignUpDto request) {
        User user = accountMapper.signUpDtoToUser(request);
        return user.toString();
    }
}
