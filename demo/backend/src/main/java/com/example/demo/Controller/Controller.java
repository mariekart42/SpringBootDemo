package com.example.demo.Controller;

import com.example.demo.Service.LoginService;
import com.example.demo.Service.PasswordManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final LoginService loginService;

    @Autowired
    public Controller(LoginService loginService)
    {
        this.loginService = loginService;
    }

//    public void tryLogin(String pw)
//    {
//        System.out.println("Login was " + loginService.login(pw));
//    }

    @GetMapping("/api/test")
    public String getString()
    {
        return "Heeeeeeeeeee";
    }

    @CrossOrigin(origins = "http://localhost:5174")
    @GetMapping("/api/getFullInfo/{name}/{password}")
    public String getString(@PathVariable String name, @PathVariable String password)
    {
        loginService.login(name);

        switch (name)
        {
            case "Marie":
            case "marie":
                return "Hey Marie Mensing";
            case "Evgeny":
            case "evgeny":
                return "Hey dude";
            default:
                return "Sorry i don't know you: " + name;
        }
    }

    @CrossOrigin(origins = "http://localhost:5174")
    @PostMapping("/api/setProfile")
    public String reveiveData(@RequestBody Profile profile)
    {
        return "Received data: " + profile.get_name() + "\n" + profile.get_age();
    }


}

class Profile
{
    private String _name;
    private int _age;

    public Profile(){}

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }
}