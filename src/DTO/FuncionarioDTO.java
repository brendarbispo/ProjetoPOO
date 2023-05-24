
package DTO;


public class FuncionarioDTO {
    
    private String nome_funcionario;
    private String email_funcionario;
    private String senha_funcionario;
    private int cargo_funcionario;
    private int id_funcionario;
    private String nome_cargo;


    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }


    public String getEmail_funcionario() {
        return email_funcionario;
    }


    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }


    public String getSenha_funcionario() {
        return senha_funcionario;
    }

    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }


    public int getCargo_funcionario() {
        return cargo_funcionario;
    }


    public void setCargo_funcionario(int cargo_funcionario) {
        this.cargo_funcionario = cargo_funcionario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

}
