/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalchallenge;

/**
 *
 * @author dishi
 */
public class Question {
    private int questionNumber;
    private String questionText;

    public Question(int questionNumber, String questionText) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
    }
    
    
    
    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

}
