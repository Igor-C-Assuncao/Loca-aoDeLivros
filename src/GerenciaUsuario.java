import java.util.ArrayList;

public class GerenciaUsuario{

    private ArrayList<Usuarios> usuario;

  public GerenciaUsuario() {
    this.usuario = new ArrayList();
  }
  
  
  
  public boolean usuarioExistente(String cpf){
    for(Usuarios checarCpf: usuario){
      if (checarCpf.getCpf() == cpf){
        return true;
      }
    }
    return false;
  }
  
    public void adicionarUsuario(Usuarios usuarioNovo){

        if (!usuarioExistente(usuarioNovo.getCpf())){
            usuario.add(new Usuarios(usuarioNovo.getNome(),usuarioNovo.getCpf(), usuarioNovo.getLivrosEmprestados()));
          }
        }
        
       




   }
    
    

