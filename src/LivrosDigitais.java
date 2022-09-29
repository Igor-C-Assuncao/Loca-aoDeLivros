public class LivrosDigitais extends Livros {

    
    
    private double tamanho;
    private String link;
    
    
    public LivrosDigitais(String titulo, double tamanho, String link) {
        super(titulo);
        this.tamanho = tamanho;
        this.link = link;
    }


    public double getTamanho() {
        return tamanho;
    }


    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }


    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }


    
    
   
    
}
