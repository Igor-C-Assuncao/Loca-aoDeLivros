public class AudioBook extends LivrosDigitais{

    private double tempoDeDuracao;
    private String formato;




  


    public AudioBook(String titulo, double tamanho, String link, double tempoDeDuracao, String formato) {
        super(titulo, tamanho, link);
        this.tempoDeDuracao = tempoDeDuracao;
        this.formato = formato;
    }


    public double getTempoDeDuracao() {
        return tempoDeDuracao;
    }


    public void setTempoDeDuracao(double tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }


    public String getFormato() {
        return formato;
    }


    public void setFormato(String formato) {
        this.formato = formato;
    }


   

    
}
