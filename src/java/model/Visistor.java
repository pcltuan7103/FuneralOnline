/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Visistor implements Serializable{
    private int vId;
    private String name,email,password;

    public Visistor() {
    }

    public Visistor(int vId, String name, String email, String password) {
        this.vId = vId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Visistor{" + "vId=" + vId + ", name=" + name + ", email=" + email + ", password=" + password + '}';
    }
    public int addNew(){
        return VisistorDB.newVisistor(this);
    }
    public Visistor login(String email, String password){
        if(this.email.equals(email)&&this.password.equals(password))
            return this;
        throw new RuntimeException("Wrong password");
    }
}
