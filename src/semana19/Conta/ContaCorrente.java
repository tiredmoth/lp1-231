package semana19.Conta;
import java.time.LocalDate;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double calcularTarifa() {
        return super.calcularTarifa();
    }

    @Override
    public void sacar(double valor) {
        if(valor > limite){
            throw new RuntimeException("Valor do saque não pode superar o limite");
        }
        super.sacar(valor);
    }
}