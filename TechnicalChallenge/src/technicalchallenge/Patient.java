/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalchallenge;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dishi
 */
public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;

    public Patient(int id, String firstName, String lastName, String gender, Date birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Patient() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    public ArrayList<Response> createResponse(QuestionDB questionDB) {
        ArrayList<Response> responseList = new ArrayList<Response>();
        Response r1 = new Response(1, "Yes");
        Response r2 = new Response(2, "Yes");
        responseList.add(r1);
        responseList.add(r2);
        return responseList;
    }
    
    public String toString() {
        String data = null;
        return data = "Patient first name is " + this.firstName + " Patient last name is " +this.lastName + " Patient gender is "
                + this.gender + " Patient date of birth is " +this.birthDate;
    }
}
