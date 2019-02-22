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
public class TechnicalChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date startDate = new Date();
        startDate.setMonth(01);
        startDate.setDate(01);
        startDate.setYear(2019);
        
        Date endDate = new Date();
        endDate.setDate(01);
        endDate.setMonth(04);
        endDate.setYear(2019);
        
        Question q1 = new Question(1, "Are you stressed?");
        Question q2 = new Question(2, "Are you suffering from depression?");
        
        QuestionDB questionDB = new QuestionDB();
        ArrayList<Question> questionList = new ArrayList<Question>();
        questionList.add(q1);
        questionList.add(q2);
        
        questionDB.setListOfQuestions(questionList);
        
        Survey survey = new Survey(1, "Patient Survey", "Patient Survey", startDate, endDate);
        survey.setQuestionDB(questionDB);
        survey.assignPatients();
    }    
}
