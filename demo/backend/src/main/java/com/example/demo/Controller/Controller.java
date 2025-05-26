package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/api/test")
    public String getString()
    {
        return "Heeeeeeeeeee";
    }
    @CrossOrigin(origins = "http://localhost:5174")
    @GetMapping("/api/getFullInfo/{name}")
    public String getString(@PathVariable String name)
    {
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