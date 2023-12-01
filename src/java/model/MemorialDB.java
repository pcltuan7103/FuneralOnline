/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class MemorialDB implements DatabaseInfo{
    public static int newMemorial(Memorial m){
        int id=-1;
        try(Connection con=DatabaseInfo.getConnect()) {
            PreparedStatement stmt=con.prepareStatement("Insert into Memorial(vId,name,place_of_birth,place_of_death,resting_place,description,imgURL,date_of_birth,date_of_death) output inserted.mId values(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, m.getvId());
            stmt.setString(2, m.getName());
            stmt.setString(3, m.getPlace_of_birth());
            stmt.setString(4, m.getPlace_of_death());
            stmt.setString(5, m.getResting_place());
            stmt.setString(6, m.getDescription());
            stmt.setString(7, m.getImgURL());
            stmt.setDate(8, (Date) m.getDOB());
            stmt.setDate(9, (Date) m.getDOD());
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(VisistorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
}
