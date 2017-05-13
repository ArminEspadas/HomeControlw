package com.example.pch61m.homecontrol.home.db;

/**
 * Created by PCH61M on 12/05/2017.
 */

public final class Profiles {

    int id;
    String description ;
    String actuators;

    public Profiles(int id, String description, String actuators) {
        this.id = id;
        this.description = description;
        this.actuators = actuators;
    }

    public int getId() {
        return id;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActuators() {
        return actuators;
    }

    public void setActuators(String actuators) {
        this.actuators = actuators;
    }
}
