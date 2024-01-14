package com.movieblog.account.service;

import com.movieblog.account.dto.SignInDto;
import com.movieblog.account.dto.SignUpDto;

public interface AccountService {

    void signUp(SignUpDto request);

    void signIn(SignInDto request);
}
