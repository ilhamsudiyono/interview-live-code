package com.miniprj.interviewcode.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.miniprj.interviewcode.auth.sercurity.CurrentUser;
import com.miniprj.interviewcode.auth.sercurity.UserPrincipal;
import com.miniprj.interviewcode.model.UserSummary;
import com.miniprj.interviewcode.repository.IUserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private IUserRepository userRepository;


    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users/me")
    @PreAuthorize("hasRole('USER')")
    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(), currentUser.getEmail());
        return userSummary;
    }


}
