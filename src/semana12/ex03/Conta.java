package semana06exs;

public class Conta {
    int codigo;
    double saldo;
    String correntista;

    public Conta(int codigo, String correntista){

        this.codigo = codigo;
        this.saldo = 0.0;
        this.correntista= correntista;

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