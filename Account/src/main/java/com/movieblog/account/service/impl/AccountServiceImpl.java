package com.movieblog.account.service.impl;

import com.movieblog.account.dto.SignInDto;
import com.movieblog.account.dto.SignUpDto;
import com.movieblog.account.entity.User;
import com.movieblog.account.mapper.AccountMapper;
import com.movieblog.account.service.AccountService;
import com.movieblog.account.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountMapper accountMapper;
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    private final AuthenticationManager authenticationManager;

    @Override
    public void signUp(SignUpDto request) {
        User user = accountMapper.signUpDtoToUser(request);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.saveUser(user);
    }

    @Override
    public void signIn(SignInDto request) {
        // TODO exception handling
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
    }
}
