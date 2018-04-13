package me.soulyana.demo;

public class BasicPerson {
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;

    BasicPerson() {

    }

    /*
    BasicPerson(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    BasicPerson(String fName, String lName, String phoneNum) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNum = phoneNum;
    }

    BasicPerson(String fName, String lName, String phoneNum, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    */

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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
