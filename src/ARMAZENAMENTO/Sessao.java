
package ARMAZENAMENTO;

import DTO.UsuarioDTO;

public class Sessao {

    private static Sessao instance;
    private UsuarioDTO usuario;

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
        return this.usuario != null;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }  
}
