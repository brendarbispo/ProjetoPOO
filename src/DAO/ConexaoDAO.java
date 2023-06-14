/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    public Connection conectaBD() {
        try {

            //tentará fazer o que esta aqui, qualquer problema irá retornar uma mensagem de erro
            

            String url = "jdbc:mysql://localhost:3306/p-java";

            return DriverManager.getConnection(url, "root", "MyKeyword");

        } catch (SQLException erro) {
            //mensagem de erro
            JOptionPane.showMessageDialog((null), "ConexaoDAO " + erro.getMessage());
            throw new RuntimeException(erro);
        }
    }

}
