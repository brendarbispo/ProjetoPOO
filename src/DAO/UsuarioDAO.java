package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    public List<UsuarioDTO> pesquisar() {

        String sql = "SELECT idusuario, nome, email, senha, datacadastro, cargo FROM `usuarios`";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            List<UsuarioDTO> lista = new ArrayList<>();
            //enquanto tiver linha traga o proximo
            while (rs.next()) {

                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setId(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setCadastro(rs.getString("datacadastro"));
                usuario.setCargo(rs.getBoolean("cargo"));

                lista.add(usuario);

            }
            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public void cadastrar(UsuarioDTO usuario) {

        String sql = "INSERT INTO usuarios (`nome`, `email`, `senha`, `datacadastro`, `cargo`) VALUES (? , ?, ?, now(), ?)";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.setBoolean(4, usuario.isCargo());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO, Cadastrar" + erro);
            throw new RuntimeException(erro);
        }

    }

    public void alterar(UsuarioDTO usuario) {

        String sql = "UPDATE usuarios SET `nome`=?,`email`=?,`senha`=?,`cargo`= ? WHERE idusuario = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql);) {

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getEmail());
            pstm.setString(3, usuario.getSenha());
            pstm.setBoolean(4, usuario.isCargo());
            pstm.setInt(5, usuario.getId());

            pstm.execute();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO, Alterar " + erro);
            throw new RuntimeException(erro);
        }

    }

    public int ultimoId() {

        String sql = "SELECT idusuario FROM `usuarios` ORDER BY idusuario DESC LIMIT 1";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql); ResultSet rs = pstm.executeQuery()) {

            if (rs.next()) {

                int ultimoid = rs.getInt("idusuario");
                return ultimoid;
            }
            return 0;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO, Pesquisar: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public UsuarioDTO autenticacao(UsuarioDTO login) {

        String sql = "SELECT idusuario, nome, email, senha, datacadastro, cargo  FROM usuarios WHERE email = ? AND senha = ?";

        try (
                Connection conn = new ConexaoDAO().conectaBD(); PreparedStatement pstm = conn.prepareStatement(sql);) {

            //atribuindo os "?" com os get
            pstm.setString(1, login.getEmail());
            pstm.setString(2, login.getSenha());

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {

                UsuarioDTO autenticado = new UsuarioDTO();
                autenticado.setId(rs.getInt("idusuario"));
                autenticado.setNome(rs.getString("nome"));
                autenticado.setEmail(rs.getString("email"));
                autenticado.setSenha(rs.getString("senha"));
                autenticado.setCadastro(rs.getString("datacadastro"));
                autenticado.setCargo(rs.getBoolean("cargo"));

                return autenticado;
            }

            return null;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }

}
