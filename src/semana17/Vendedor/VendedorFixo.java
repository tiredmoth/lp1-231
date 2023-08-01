package semana17.Vendedor;

public class VendedorFixo extends Vendedor{

    private double salario;


    public VendedorFixo(String nome, double vendas, double comissao, double salario){
        super(nome,vendas,comissao);
        this.salario=salario;
    }
    @Override
    public double obterSalario(){
        return (vendas*(comissao/100))+salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
