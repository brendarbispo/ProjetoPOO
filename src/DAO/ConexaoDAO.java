/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexaoDAO {
    
    
    public Connection conectaBD(){
        
            Connection conn = null;

            try{
                               
                //tentará fazer o que esta aqui, qualquer problema irá retornar uma mensagem de erro
                            Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3307/p-java";
                
                conn = DriverManager.getConnection(url, "root", "");

            }catch (SQLException erro){
                //mensagem de erro

            JOptionPane.showMessageDialog((null),"ConexaoDAO " + erro.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return conn;

    }

}
