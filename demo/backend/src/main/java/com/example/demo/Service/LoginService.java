package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    private final PasswordManager _pwManager;

    @Autowired
    public LoginService(PasswordManager pwManager)
    {
        this._pwManager = pwManager;
    }

    public boolean login(String pw)
    {
        if (!_pwManager.IsUserRegistered())
        {
            System.out.println("User is not registered");
            return false;
        }

        System.out.println("Login with pw: "+pw+" was " + _pwManager.IsPasswordValid(pw) + " because of your password");
        return _pwManager.IsPasswordValid(pw);
    }
}
