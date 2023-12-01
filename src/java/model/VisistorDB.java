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
public class VisistorDB implements DatabaseInfo{
    public static int newVisistor(Visistor v){
        int id=-1;
        try(Connection con=DatabaseInfo.getConnect()) {
            PreparedStatement stmt=con.prepareStatement("Insert into Visistor(name, email,password) output inserted.vId values(?,?,?)");
            stmt.setString(1, v.getName());
            stmt.setString(2, v.getEmail());
            stmt.setString(3, v.getPassword());
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
        public static Visistor getVisistor(String email){
        Visistor v=null;
        try(Connection con=DatabaseInfo.getConnect()) {
            PreparedStatement stmt=con.prepareStatement("Select vId,name,password from Visistor where email=?");
            stmt.setString(1, email);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String password=rs.getString(3);
                v=new Visistor(id, name, email, password);
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(VisistorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
}
