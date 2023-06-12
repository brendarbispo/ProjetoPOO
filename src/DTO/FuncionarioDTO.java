
package DTO;

public abstract class FuncionarioDTO {
    

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String cadastro;
    private boolean cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public boolean isCargo() {
        return cargo;
    }

    public void setCargo(boolean cargo) {
        this.cargo = cargo;
    }
    
    public FuncionarioDTO logar(UsuarioDTO usuario){
        FuncionarioDTO funcionario;
        if(usuario.isCargo()){
            funcionario = new GerenciaDTO();
            
        }else{
            funcionario = new AtendimentoDTO();
        }
        
        funcionario.setNome(usuario.getNome());
        funcionario.setEmail(usuario.getEmail());
        funcionario.setSenha(usuario.getSenha());
        funcionario.setCargo(usuario.isCargo());
        funcionario.setId(usuario.getId());
        
        
        return funcionario;
    }
    public abstract boolean ler();
    public abstract boolean editar();
    public abstract boolean criar();
    public abstract boolean apagar();
    
    
    
    
    
}

