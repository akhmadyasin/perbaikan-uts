/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perbaikan;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Yasin
 */
public class Perbaikan {
    
    private static Connection perbaikan;
    
    public static Connection getKoneksi(){
        if (perbaikan == null){
            try{
                String url ="jdbc:mysql://localhost/mahasiswa";
                String user="root";
                String pass="";
                perbaikan = DriverManager.getConnection(url, user, pass);             
                System.out.println("Koneksi berhasil;");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return perbaikan;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = getKoneksi();
        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Koneksi sukses!");
        }
    }
    }
    
    
