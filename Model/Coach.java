package com.souleyman.carriel.Model;

public class Coach {
    private String firstName;
    private String lastName;
    private String alias;
    private boolean isHeadCoach;

    public boolean isHeadCoach() {
        return isHeadCoach;
    }

    public void setHeadCoach(boolean headCoach) {
        isHeadCoach = headCoach;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
