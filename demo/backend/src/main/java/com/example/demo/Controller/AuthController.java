package com.example.demo.Controller;

import com.example.demo.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthController {

    private final LoginService loginService;

    @Autowired
    public AuthController(LoginService loginService)
    {
        this.loginService = loginService;
    }

    public void tryLogin(String pw)
    {
        System.out.println("Login was " + loginService.login(pw));
    }
}
