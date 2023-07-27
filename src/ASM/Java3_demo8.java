/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Java3_demo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        // TODO code application logic here
        Connection conn = KETNOISQL.getConnection("sa","bachvanchilo","empolyees");
//        String sql = "select * from student where id= ?";
//xem danh sach nhan vien theo ho
String sql = "select * from student where firstname like ? ";
        
        //tao prepare statement1
        
        PreparedStatement pst = conn.prepareStatement(sql);
        //xac dinh gia tri tham so
        pst.setString(1, "%nguyen%");
//        //xac dinh gia tri tham so
//        Scanner sc = new Scanner(System.in);
//            System.out.println("id=? ");
//        int id = sc.nextInt();
//        pst.setInt(1, id);

        //thuc hien
        ResultSet rs=pst.executeQuery();
//        if(rs.next())
//                System.out.println(
//                        rs.getString("firstname")+", "+
//                                rs.getInt("age")
//                );
//        else{
//            System.out.println("khong co nhan vien nay");
//        }
//        
//    }catch(SQLException ex){
//        
//    }
while(rs.next()){
                System.out.println(
                        rs.getString("firstname")+", "+
                                rs.getString("lastname")
                );
        
    }
}catch(SQLException ex){
        ex.printStackTrace();
    }
    
}
}
