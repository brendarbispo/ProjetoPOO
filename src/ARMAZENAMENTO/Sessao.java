
package ARMAZENAMENTO;

import DTO.FuncionarioDTO;
import DTO.UsuarioDTO;

public class Sessao {

    private static Sessao instance;
    private FuncionarioDTO funcionario;

    private Sessao() {
        // Construtor privado para evitar a criação direta de instâncias
    }

    
    public static synchronized Sessao getInstance() {
        if (instance == null) {
            instance = new Sessao();
        }
        return instance;
    }
    
    public boolean autenticado(){
        return this.funcionario != null;
    }

    
    public void setFuncionario(FuncionarioDTO funcionario){
        this.funcionario = funcionario;
        
    }
    
        public FuncionarioDTO getFuncionario(){
        return funcionario;
        
    }

 
}
