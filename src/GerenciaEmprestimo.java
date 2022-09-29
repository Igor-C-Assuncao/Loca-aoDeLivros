import java.util.ArrayList;

public class GerenciaEmprestimo {

    private ArrayList<Emprestimo> ListaDeEmprestimos;

  public GerenciaEmprestimo() {
    this.ListaDeEmprestimos = new ArrayList();

  }
  
  

  public void realizarEmprestimo(Usuario usuarioRequerente, Livros livroASerEmprestado )throws LivroNaoEncontradoException , UsuarioNaoEncontradoExeption
  {
   GerenciaLivro checklivro = new GerenciaLivro();

   if(checklivro.livroExistente(livroASerEmprestado.getTitulo())){
        ListaDeEmprestimos.add(new Emprestimo( livroASerEmprestado, usuarioRequerente);

   }else{
    throw new LivroNaoEncontradoException();
   }
   if(checklivro.usuarioExistente(usuarioRequerente.getcpf())){
    ListaDeEmprestimos.add(new Emprestimo( livroASerEmprestado, usuarioRequerente);

}else{
throw new UsuarioNaoEncontradoExeption();
}
    

    

  }




    
}
