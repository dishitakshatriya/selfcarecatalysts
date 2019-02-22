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
public class Survey {
    private int id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private QuestionDB questionDB;

    public Survey() {
    }
    

    public Survey(int id, String name, String description, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public QuestionDB getQuestionDB() {
        return questionDB;
    }

    public void setQuestionDB(QuestionDB questionDB) {
        this.questionDB = questionDB;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public void assignPatients() {
        Date birthdate = new Date();
        birthdate.setDate(11);
        birthdate.setYear(1990);
        birthdate.setMonth(12);
        Patient patient = new Patient(1, "Mary", "Jonas", "female", birthdate);
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        patientList.add(patient);
        System.out.println(patient.toString());
    }
}
