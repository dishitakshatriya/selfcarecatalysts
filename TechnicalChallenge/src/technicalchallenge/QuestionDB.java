/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalchallenge;

import java.util.ArrayList;

/**
 *
 * @author dishi
 */
public class QuestionDB {

    private Question question;
    private ArrayList<Question> listOfQuestions;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public ArrayList<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(ArrayList<Question> listOfQuestions) {
        this.listOfQuestions = listOfQuestions;
    }

}
