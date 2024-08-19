package com.perscholas.exerciseone_taketwo.model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @PostMapping("/users")
    public void printData (@RequestBody User user){
        System.out.println("Printing the user data:" +user);
    }


}
