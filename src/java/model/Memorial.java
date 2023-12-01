/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Memorial implements Serializable {

    private int mId, vId;
    private String name, place_of_birth, place_of_death, resting_place, description, imgURL;
    private Date date_of_birth, date_of_death;

    public Memorial() {
    }

    public Memorial(int mId, int vId, String name, String date_of_birth, String place_of_birth, String date_of_death, String place_of_death, String resting_place, String description, String imgURL) {
        this.mId = mId;
        this.vId = vId;
        this.name = name;
        setDate_of_birth(date_of_birth);
        this.place_of_birth = place_of_birth;
        setDate_of_death(date_of_death);
        this.place_of_death = place_of_death;
        this.resting_place = resting_place;
        this.description = description;
        this.imgURL = imgURL;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
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

    public String getDate_of_birth() {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(date_of_birth);
    }

    public void setDate_of_birth(String date_of_birth) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.date_of_birth = new java.sql.Date(sd.parse(date_of_birth).getTime());
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date of birth");
        }
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getDate_of_death() {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(date_of_death);
    }

    public void setDate_of_death(String date_of_death) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.date_of_death = new java.sql.Date(sd.parse(date_of_death).getTime());
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date of death");
        }
    }

    public String getPlace_of_death() {
        return place_of_death;
    }

    public void setPlace_of_death(String place_of_death) {
        this.place_of_death = place_of_death;
    }

    public String getResting_place() {
        return resting_place;
    }

    public void setResting_place(String resting_place) {
        this.resting_place = resting_place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public Date getDOB() {
        return date_of_birth;
    }

    public Date getDOD() {
        return date_of_death;
    }

    public String getRange() {
        return getDate_of_birth().substring(6)+"-"+getDate_of_death().substring(6);
    }
    
    public String getShortdescript(){
        return description.substring(0, 90)+"...";
    }
    @Override
    public String toString() {
        return "Memorial{" + "mId=" + mId + ", vId=" + vId + ", name=" + name + ", date_of_birth=" + date_of_birth + ", place_of_birth=" + place_of_birth + ", date_of_death=" + date_of_death + ", place_of_death=" + place_of_death + ", resting_place=" + resting_place + ", description=" + description + ", imgURL=" + imgURL + '}';
    }

    public int addNew() {
        return MemorialDB.newMemorial(this);
    }
}
