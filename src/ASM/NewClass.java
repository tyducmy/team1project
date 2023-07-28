/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
///**
// *
// * @author Tyler
// */
//public class NewClass {
//        public static void main(String[] args) {
//        try{
//        // TODO code application logic here
//        Connection conn = KETNOISQL.getConnection("sa","bachvanchilo","empolyees");
////        String sql = "select * from student where id= ?";
////xem danh sach nhan vien theo ho
//String sql = "select * from student where age between ? and ? ";
//        
//        //tao prepare statement1
//        
//        PreparedStatement pst = conn.prepareStatement(sql);
//        //xac dinh gia tri tham so
//        
////        //xac dinh gia tri tham so
//        Scanner sc = new Scanner(System.in);
//            System.out.println("tuoi=? ");
//        int id = sc.nextInt();
//        pst.setInt(1, id);
//
//        //thuc hien
//        ResultSet rs=pst.executeQuery();
//        if(rs.next())
//                System.out.println(
//                        rs.getString("firstname")+", "+
//                                rs.getInt("lastname")
//                );
//        else{
//            System.out.println("khong co nhan vien nay");
//        }
//        String insert = "insert into student values (?,?,?,?)";
//        String update = "update student set age =  where id = ?";
//        String delete = "delete student where id = ?";
//        pst = conn.prepareStatement(insert);
//        // gia tri tham so
//        pst.setInt(1,90);pst.setString(2, "An");
//        pst.setString(3,"Tran");pst.setInt(4,25);
//        //thuc hien
//        int k = pst.executeUpdate();//so dong chiu anh huong
//        //sua tuoi cua nguoi co id 90 = 50
//        pst = conn.prepareStatement(update);
//        pst.setInt(1,50);pst.setInt(2,90);
//        pst.executeUpdate();
//    }catch(SQLException ex){
//        
//    }
////while(rs.next()){
////                System.out.println(
////                        rs.getString("firstname")+", "+
////                                rs.getString("lastname")
////                );
////        
////    }
//    
//}
////}
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class NewClass {
//    public static void main(String[] args) {
//        try {
//            // TODO code application logic here
//            Connection conn = KETNOISQL.getConnection("sa", "bachvanchilo", "empolyees");
//
//            // Retrieve a list of students whose age is within a specific range
//            String sql = "SELECT * FROM student WHERE age BETWEEN ? AND ?";
//            PreparedStatement pst = conn.prepareStatement(sql);
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the lower age limit: ");
//            int lowerAge = sc.nextInt();
//            System.out.println("Enter the upper age limit: ");
//            int upperAge = sc.nextInt();
//
//            pst.setInt(1, lowerAge);
//            pst.setInt(2, upperAge);
//
//            ResultSet rs = pst.executeQuery();
//            while (rs.next()) {
//                System.out.println(
//                    rs.getString("firstname") + ", " +
//                    rs.getString("lastname") + ", " +
//                    rs.getInt("age")
//                );
//            }
//
//            String insert = "INSERT INTO student (id, firstname, lastname, age) VALUES (?, ?, ?, ?)";
//            String update = "UPDATE student SET age = ? WHERE id = ?";
//            String delete = "DELETE FROM student WHERE id = ?";
//
//            // Insert a new student into the "student" table
//            pst = conn.prepareStatement(insert);
//            pst.setInt(1, 90);
//            pst.setString(2, "An");
//            pst.setString(3, "Tran");
//            pst.setInt(4, 25);
//            pst.executeUpdate();
//
//            // Update the age of a student with a specific ID in the "student" table
//            pst = conn.prepareStatement(update);
//            int newAge = 50;
//            int studentIdToUpdate = 90;
//            pst.setInt(1, newAge);
//            pst.setInt(2, studentIdToUpdate);
//            pst.executeUpdate();
//
//            // Delete a student with a specific ID from the "student" table
//            pst = conn.prepareStatement(delete);
//            int studentIdToDelete = 90;
//            pst.setInt(1, studentIdToDelete);
//            pst.executeUpdate();
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
//}
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Connection conn = KETNOISQL.getConnection("sa", "bachvanchilo", "empolyees");

            // Insert a new student into the "student" table
            String insert = "INSERT INTO student (id, firstname, lastname, age) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(insert);
            pst.setInt(1, 90);
            pst.setString(2, "An");
            pst.setString(3, "Tran");
            pst.setInt(4, 25);
            pst.executeUpdate();

            // Update the age of a student with a specific ID in the "student" table
//            String update = "UPDATE student SET age = ? WHERE id = ?";
//            pst = conn.prepareStatement(update);
//            int newAge = 50;
//            int studentIdToUpdate = 90;
//            pst.setInt(1, newAge);
//            pst.setInt(2, studentIdToUpdate);
//            pst.executeUpdate();

            // Delete a student with a specific ID from the "student" table
//            String delete = "DELETE FROM student WHERE id = ?";
//            pst = conn.prepareStatement(delete);
//            int studentIdToDelete = 90;
//            pst.setInt(1, studentIdToDelete);
//            pst.executeUpdate();

            System.out.println("Insert, Update, and Delete operations completed successfully.");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


