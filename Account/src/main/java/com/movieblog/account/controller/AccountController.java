package com.movieblog.account.controller;

import com.movieblog.account.dto.SignUpDto;
import com.movieblog.account.service.AccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/sign-up")
    public void signUp(@Valid @RequestBody SignUpDto request) {
        accountService.signUp(request);
    }

    @PostMapping("/sign-in")
    public void signIn() {

    }
}
