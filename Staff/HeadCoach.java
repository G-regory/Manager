package com.souleyman.carriel.Model.Staff;

public class HeadCoach {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String
    toString() {
        return "Head Coach: " +
                getName();
    }
}
