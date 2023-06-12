
package DTO;

public class AtendimentoDTO extends FuncionarioDTO {
    
        
    @Override 
    public boolean ler(){
        return true;
    }
    @Override 
    public boolean editar(){
        return false;
    }
    @Override 
    public boolean criar(){
        return false;
        
    }
    @Override 
    public boolean apagar(){
        return false;
    }
    
}
