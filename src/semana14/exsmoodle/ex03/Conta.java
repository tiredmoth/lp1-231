package semana14.ex03;

public class Conta {
    int codigo;
    double saldo;
    String correntista;

    public Conta(int codigo, String correntista){

        this.setCodigo(codigo);
        this.setSaldo(0.0);
        this.setCorrentista(correntista);

    }

    private void setCodigo(int codigo){
        if(codigo < 0){
            throw new RuntimeException("codigo inválido!");
        }
        this.codigo = codigo;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private void setCorrentista(String correntista){
        if(correntista.length() <= 5 && correntista.length() >= 100){
            throw new RuntimeException("nome inválido!");
        }
        this.correntista = correntista;
    }

    public void depositarDinheiro(double deposito) {
        saldo = saldo + deposito;
        }

    public String sacarDinheiro (double saque) {
        if (saldo - saque > 0){
            saldo = saldo - saque;
            String saldostr = Double.toString(saldo);
            return saldostr;
        }
        else{

          return "Saldo insuficiente"; 
        }
    }

    public String transferirDinheiro (double transferencia) {
            if (saldo - transferencia > 0){
                saldo = saldo - transferencia;
                String saldostr = Double.toString(saldo);
                return saldostr;
            }
            else{
                return "Saldo insuficiente";
            }
    }


}
