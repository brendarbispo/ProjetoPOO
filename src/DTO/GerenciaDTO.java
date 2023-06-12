
package DTO;

public class GerenciaDTO extends FuncionarioDTO {
    
    
    @Override
    public boolean ler(){
        return true;
    }
    @Override 
    public boolean editar(){
        return true;
    }
    @Override 
    public boolean criar(){
        return true;
        
    }
    @Override 
    public boolean apagar(){
        return true;
    }
    
}
