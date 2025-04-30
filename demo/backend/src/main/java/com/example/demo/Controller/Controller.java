package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

//    @GetMapping("/api/test")
//    public String getString()
//    {
//        return "Heeeeeeeeeee";
//    }

    @GetMapping("/api/test/{someNumber}")
    public String getString(@PathVariable String someNumber)
    {
        return "Heeeeeeeeeee: " + someNumber;
    }

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