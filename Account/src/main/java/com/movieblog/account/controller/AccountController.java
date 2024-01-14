package com.movieblog.account.controller;

import com.movieblog.account.dto.SignUpDto;
import com.movieblog.account.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/sign-up")
    public String signUp(@Valid @RequestBody SignUpDto request) {
        return accountService.signUp(request);
    }

    @PostMapping("/sign-in")
    public void signIn() {

    }

    @GetMapping("/token")
    public String getToken() {
        return null;
    }
}
