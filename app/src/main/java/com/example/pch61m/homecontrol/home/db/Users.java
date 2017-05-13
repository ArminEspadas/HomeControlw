package com.example.pch61m.homecontrol.home.db;

/**
 * Created by PCH61M on 12/05/2017.
 */

public final class Users {

    int id;
    String name;
    String lastname;
    String email;
    String pass;

    public Users(int id, String name, String lastname, String email, String pass) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
