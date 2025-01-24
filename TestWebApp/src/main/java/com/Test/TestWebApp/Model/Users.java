package com.Test.TestWebApp.Model;




public class Users {

    private String name;
    private String number;
    private String skills;
    private String jobTitle;

    // Constructor
    public Users(String name, String number, String skills, String jobTitle) {
        this.name = name;
        this.number = number;
        this.skills = skills;
        this.jobTitle = jobTitle;
    }

    public Users() {

    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
