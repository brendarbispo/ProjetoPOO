package DAO;

import DTO.CargoDTO;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void cadastrarProduto(ProdutoDTO objProdutoDto) {

        String sql = "INSERT INTO produtos (`nomeproduto`, `valor`) VALUES (? , ?)";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, objProdutoDto.getNome_produto());
            pstm.setFloat(2, objProdutoDto.getValor());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ProdutoDAO, Cadastrar" + erro);
            throw new RuntimeException(erro);
        }

    }

    public List<ProdutoDTO> pesquisarProdutos() {

        String sql = "SELECT idproduto, nomeProduto, valor FROM produtos";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ResultSet rs = pstm.executeQuery()
                ) {
            List<ProdutoDTO> lista = new ArrayList<>();
            //enquanto tiver linha traga o proximo
            while (rs.next()) {

                ProdutoDTO objProdutoDto = new ProdutoDTO();
                objProdutoDto.setId_produto(rs.getInt("idproduto"));
                objProdutoDto.setNome_produto(rs.getString("nomeproduto"));
                objProdutoDto.setValor(rs.getFloat("valor"));

                lista.add(objProdutoDto);

            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ProdutoDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public ProdutoDTO buscarProdutoPeloId(int id) {

        String sql = "SELECT idusuarios FROM `usuarios` WHERE idproduto = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ) {
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {

                ProdutoDTO objProdutoDto = new ProdutoDTO();
                objProdutoDto.setId_produto(rs.getInt("idproduto"));
                objProdutoDto.setNome_produto(rs.getString("nomeproduto"));
                objProdutoDto.setValor(rs.getFloat("valor"));
                
                return objProdutoDto;
            }
            return null;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ProdutoDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public void alterarProduto(ProdutoDTO objProdutoDto) {

        String sql = "UPDATE produtos SET `nomeproduto`=?,`valor`=? WHERE idproduto = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql);) {

            pstm.setString(1, objProdutoDto.getNome_produto());
            pstm.setFloat(2, objProdutoDto.getValor());
            pstm.setInt(3, objProdutoDto.getId_produto());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Alterar " + erro);
            throw new RuntimeException(erro);
        }

    }
    
    
    
    public int buscarUltimoId() {

        String sql = "SELECT idproduto FROM `produtos` ORDER BY idproduto DESC LIMIT 1";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); 
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ResultSet rs = pstm.executeQuery()) {
            if (rs.next()) {

                int ultimoid = rs.getInt("idproduto");
                return ultimoid;

            }
            return 0;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "ProdutoDAO, Pesquisar ID : " + erro);
            throw new RuntimeException(erro);
        }
    }
    
    public void deletarProduto(int id) {

        String sql = "DELETE FROM produtos WHERE idproduto = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql);) {

            pstm.setInt(1, id);

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "FuncionarioDAO, Excluir " + erro);
            throw new RuntimeException(erro);
        }

    }
 
   
}
