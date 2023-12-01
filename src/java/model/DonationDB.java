/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DatabaseInfo;
import model.DatabaseInfo;


/**
 *
 * @author PC
 */
public class DonationDB implements DatabaseInfo{
    public static int newDonate(Donation d){
        int id=-1;
        try(Connection con=DatabaseInfo.getConnect()) {
            PreparedStatement stmt=con.prepareStatement("Insert into Donation(vId, fund) output inserted.dId values(?,?)");
            stmt.setInt(1, d.getvId());
            stmt.setDouble(2, d.getFund());

            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(DonationDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
