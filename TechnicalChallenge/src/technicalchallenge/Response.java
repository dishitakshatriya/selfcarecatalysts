/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package technicalchallenge;

import java.util.Date;

/**
 *
 * @author dishi
 */
public class Response {
    private int id;
    private String responseValue;

    public Response(int id, String responseValue) {
        this.id = id;
        this.responseValue = responseValue;
    }

    public Response() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponseValue() {
        return responseValue;
    }

    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }
    
}
