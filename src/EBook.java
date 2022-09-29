public class EBook extends LivrosDigitais{

    
    private int quntPAginas;
    
   

    public EBook(String titulo, double tamanho, String link, int quntPAginas) {
        super(titulo, tamanho, link);
        this.quntPAginas = quntPAginas;
    }

    public int getQuntPAginas() {
        return quntPAginas;
    }

    public void setQuntPAginas(int quntPAginas) {
        this.quntPAginas = quntPAginas;
    }

}
