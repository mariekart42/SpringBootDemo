package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PasswordManager {
    private String _pw;

    @Autowired
    public PasswordManager()
    {}

    public boolean IsUserRegistered()
    {
        return get_pw() != null && !get_pw().isBlank();
    }

    public boolean IsPasswordValid(String pw)
    {
        return false;
    }

    public String get_pw() {
        return _pw;
    }

    public void set_pw(String _pw) {
        this._pw = _pw;
    }
}
