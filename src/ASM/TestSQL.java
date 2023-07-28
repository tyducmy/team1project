/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Tyler
 */
public class TestSQL {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        try{
             conn = KETNOISQL.getConnection("sa","bachvanchilo","employees");
        String sql = "select * from student where age>=20";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){// con phan tu ke tiep
            System.out.println(
                    rs.getInt("id")+", "+
                            rs.getString("firstname")+", "+
                            rs.getString("lastname")+", "+
                            rs.getInt("age"));
        }
        rs.close();
        
        String insertSQL = "insert int student values ('11','hoang','tran','23)";
        String updateSQL = "update student set firstname='hoa' where id=2";
        String deleteSQL="delete from student where id=3";
        Statement actionSt=conn.createStatement();
        int soDong=actionSt.executeUpdate(insertSQL);
        if(soDong>0) System.out.println("Da chen insert");
        
        soDong=actionSt.executeUpdate(updateSQL);
        if(soDong>0) System.out.println("Da sua edit");
        
        soDong=actionSt.executeUpdate(deleteSQL);
        if(soDong>0) System.out.println("Da xoa delete");
         
        
        }catch (SQLException ex){}
        
        
    }

    static Connection getConnection(String sa, String bachvanchilo, String empolyees) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
