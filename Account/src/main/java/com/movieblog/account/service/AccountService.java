package com.movieblog.account.service;

import com.movieblog.account.dto.SignUpDto;

public interface AccountService {

    void signUp(SignUpDto request);
}
