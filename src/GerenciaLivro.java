import java.util.ArrayList;

public class GerenciaLivro {

    private ArrayList<Livros> livrosLista;

    public GerenciaLivro() {
      this.livrosLista = new ArrayList();
    }
    


   
    
    boolean livroExistente(String titulo){
      for(Livros checarTitulo:livrosLista ){
        if (checarTitulo.getTitulo() == titulo ){
          return true;
        }
      }
      return false;
    }
    
      public void adicionarLivroFisico(LivrosFisicos livroNovo){
  
          if (!livroExistente(livroNovo.getTitulo())){
              livrosLista.add(new LivrosFisicos(livroNovo.getTitulo(),livroNovo.getIsbn(),livroNovo.getEdicao()));
            }
          }

          public void adicionarEbook(EBook livroNovo){
  
            if (!livroExistente(livroNovo.getTitulo())){
                livrosLista.add(new EBook(livroNovo.getTitulo(),livroNovo.getTamanho(),livroNovo.getLink(),livroNovo.getQuntPAginas()));
              }
            }
            
          public void adicionarAudioBook(AudioBook livroNovo){
  
            if (!livroExistente(livroNovo.getTitulo())){
                livrosLista.add(new AudioBook(livroNovo.getTitulo(),livroNovo.getTamanho(),livroNovo.getLink(),livroNovo.getTempoDeDuracao(),livroNovo.getFormato()));
              }
            }
         
}
