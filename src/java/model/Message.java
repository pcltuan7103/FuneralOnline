/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PC
 */
public class Message implements Serializable{
    private int msgId,vId,mId;
    private String message, photoURL;
    private Date date;

    public Message() {
    }

    public Message(int msgId, int vId, int mId, String message, String photoURL, String date) {
        this.msgId = msgId;
        this.vId = vId;
        this.mId = mId;
        this.message = message;
        this.photoURL = photoURL;
        setDate(date);
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getDate() {
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(date);
    }

    public void setDate(String date) {
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.date = new java.sql.Date(sd.parse(date).getTime());
        } catch (ParseException ex) {
            throw new RuntimeException("Invalid date of birth");
        }
    }

    @Override
    public String toString() {
        return "Message{" + "msgId=" + msgId + ", vId=" + vId + ", mId=" + mId + ", message=" + message + ", photoURL=" + photoURL + ", date=" + date + '}';
    }
    
}
