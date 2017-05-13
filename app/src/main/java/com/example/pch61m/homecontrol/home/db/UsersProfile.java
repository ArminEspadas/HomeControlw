package com.example.pch61m.homecontrol.home.db;

/**
 * Created by PCH61M on 12/05/2017.
 */

public final class UsersProfile {

    int id_user;
    int id_profile;


    public UsersProfile(int id_user, int id_profile) {
        this.id_user = id_user;
        this.id_profile = id_profile;
    }

    public int getId_user() {
        return id_user;
    }


    public int getId_profile() {
        return id_profile;
    }

    public void setId_profile(int id_profile) {
        this.id_profile = id_profile;
    }
}
