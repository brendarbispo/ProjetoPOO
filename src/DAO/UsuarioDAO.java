
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    Connection conn;
    
    //trazer algo do banco e retornar algo
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuariodto){
        
        //conexao com o banco
        conn = new ConexaoDAO().conectaBD();
        
        try{
            //tenta retornar algum resultado do banco com os seguintes comando
            
            String sql = "select * from usuarios where email = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            //atribuindo os "?" com os get
            pstm.setString(1,objUsuariodto.getNome_usuario());
            pstm.setString(2, objUsuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
        
    }
    
}
