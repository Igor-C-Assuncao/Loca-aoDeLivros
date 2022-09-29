public class Usuarios {

    private String nome;
    private String cpf;
    private String[] livrosEmprestados;


    
    
    


    public Usuarios(String nome, String cpf, String[] livrosEmprestados) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = livrosEmprestados;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String[] getLivrosEmprestados() {
        return livrosEmprestados;
    }


    public void setLivrosEmprestados(String[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }




    
    
}
