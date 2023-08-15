package semana17.Conta;

public class Empresa {
    private String cnpj;
    private String nome;


    public Empresa(String cnpj, String nome) {
        this.setCnpj(cnpj);
        this.setNome(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
