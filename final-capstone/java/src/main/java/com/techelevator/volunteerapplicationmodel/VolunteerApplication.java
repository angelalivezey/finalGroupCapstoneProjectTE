package com.techelevator.volunteerapplicationmodel;

public class VolunteerApplication {

    private int applicationID;
    private int applicationStatusID;
    private  String name;
    private String email;
    private String phone;
    private String description;

    public VolunteerApplication (){

    }

    public VolunteerApplication(int applicationID, int applicationStatusID, String name, String email, String phone, String description){
        this.applicationID= applicationID;
        this.applicationStatusID = applicationStatusID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.description = description;
    }

    public int getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(int applicationID) {
        this.applicationID = applicationID;
    }

    public int getApplicationStatusID() {
        return applicationStatusID;
    }

    public void setApplicationStatusID(int applicationStatusID) {
        this.applicationStatusID = applicationStatusID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
