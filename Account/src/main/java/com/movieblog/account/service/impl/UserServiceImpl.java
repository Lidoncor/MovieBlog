package com.movieblog.account.service.impl;

import com.movieblog.account.entity.User;
import com.movieblog.account.repository.UserRepository;
import com.movieblog.account.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
