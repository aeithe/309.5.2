package com.perscholas.exerciseone_taketwo.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    int id;
    String name;
    String email;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setName(){

        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "User{" + "id" + id + ", name='" + name + '\'' + ", email = '" + email + '\'' + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

