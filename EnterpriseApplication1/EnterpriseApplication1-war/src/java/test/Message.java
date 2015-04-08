/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Sudeera
 */
@ManagedBean(name="message",eager=true)
@RequestScoped
public class Message {
    
    
    private String message="Hello World";
    private String name="Fast and Furious";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
