package DAO;

import DTO.CargoDTO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    public void cadastrarFuncionario(FuncionarioDTO objFuncionariodto) {

        String sql = "INSERT INTO usuarios (`nome`, `email`, `senha`, `datacadastro`, `idcargo`) VALUES (? , ?, ?, now(), ?)";

        try (
                Connection conn = new ConexaoDAO().conectaBD();
                PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setString(1, objFuncionariodto.getNome_funcionario());
            pstm.setString(2, objFuncionariodto.getEmail_funcionario());
            pstm.setString(3, objFuncionariodto.getSenha_funcionario());
            pstm.setInt(4, objFuncionariodto.getCargo_funcionario());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Cadastrar" + erro);
            throw new RuntimeException(erro);
        }

    }

    public List<FuncionarioDTO> pesquisarFuncionario() {

        String sql = "SELECT u.idusuarios, u.nome, u.email, u.senha, u.datacadastro, c.nomecargo FROM `usuarios` u INNER JOIN `cargos` c ON u.idcargo = c.idcargo";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
            List<FuncionarioDTO> lista = new ArrayList<>();
            //enquanto tiver linha traga o proximo
            while (rs.next()) {

                FuncionarioDTO objFuncionariodto = new FuncionarioDTO();
                objFuncionariodto.setId_funcionario(rs.getInt("idusuarios"));
                objFuncionariodto.setNome_funcionario(rs.getString("nome"));
                objFuncionariodto.setEmail_funcionario(rs.getString("email"));
                objFuncionariodto.setNome_cargo(rs.getString("nomecargo"));

                lista.add(objFuncionariodto);

            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public int buscarUltimoId() {

        String sql = "SELECT idusuarios FROM `usuarios` ORDER BY idusuarios DESC LIMIT 1";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ResultSet rs = pstm.executeQuery()) {
            if (rs.next()) {

                int ultimoid = rs.getInt("idusuarios");
                return ultimoid;

            }
            return 0;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public List<CargoDTO> buscarCargos() {

        String sql = "select idcargo, nomecargo from cargos";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {
            List<CargoDTO> cargos = new ArrayList<>();

            //enquanto tiver linha traga o proximo
            while (rs.next()) {
                CargoDTO objcargodto = new CargoDTO();
                objcargodto.setId_cargo(rs.getInt("idcargo"));
                objcargodto.setNome_cargo(rs.getString("nomecargo"));

                cargos.add(objcargodto);
            }
            return cargos;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void alterarFuncionario(FuncionarioDTO objFuncionariodto){
        
        
        
        String sql = "UPDATE usuarios SET `nome`=?,`email`=?,`senha`=?,`idcargo`= ? WHERE idusuarios = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
            ) {
            
            pstm.setString(1, objFuncionariodto.getNome_funcionario());
            pstm.setString(2, objFuncionariodto.getEmail_funcionario());
            pstm.setString(3, objFuncionariodto.getSenha_funcionario());
            pstm.setInt(4, objFuncionariodto.getCargo_funcionario());
            pstm.setInt(5, objFuncionariodto.getId_funcionario());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Alterar " + erro);
            throw new RuntimeException(erro);
        }
        
    }
}
