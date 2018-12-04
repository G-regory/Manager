package com.souleyman.carriel.Model;

public class Coach {
    private String name;
    private boolean isHeadCoach;

    public boolean isHeadCoach() {
        return isHeadCoach;
    }

    public void setHeadCoach(boolean headCoach) {
        isHeadCoach = headCoach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
