public class LivrosFisicos extends Livros{

    
    private String isbn;
    private double edicao;
    
    
    public LivrosFisicos(String titulo, String isbn, double edicao) {
        super(titulo);
        this.isbn = isbn;
        this.edicao = edicao;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public double getEdicao() {
        return edicao;
    }


    public void setEdicao(double edicao) {
        this.edicao = edicao;
    }



    
}
