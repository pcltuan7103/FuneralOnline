/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Donation implements Serializable {

    private int dId, vId;
    private double fund;

    public Donation() {
    }

    public Donation(int dId, int vId, double fund) {
        this.dId = dId;
        this.vId = vId;
        this.fund = fund;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    @Override
    public String toString() {
        return "Donation{" + "dId=" + dId + ", vId=" + vId + ", fund=" + fund +'}';
    }

    public int addNew(){
        return DonationDB.newDonate(this);
    }
}
