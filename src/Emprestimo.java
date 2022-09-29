public class Emprestimo {

    private Livros LivroEmprestado;   
    private Usuarios usuarioRequerente;
   
    
    
    
   


   


    public Emprestimo(Livros livroEmprestado, Usuario usuarioRequerente2) {
        LivroEmprestado = livroEmprestado;
        this.usuarioRequerente = usuarioRequerente2;
    }



    public Livros getLivroEmprestado() {
        return LivroEmprestado;
    }



    public void setLivroEmprestado(Livros livroEmprestado) {
        LivroEmprestado = livroEmprestado;
    }



    public Usuarios getUsuarioRequerente() {
        return usuarioRequerente;
    }



    public void setUsuarioRequerente(Usuarios usuarioRequerente) {
        this.usuarioRequerente = usuarioRequerente;
    }
    

}
