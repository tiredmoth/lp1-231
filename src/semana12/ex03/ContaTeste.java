package semana12.ex03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
    
    @Test
    public void deposito(){
        
        Conta conta1 = new Conta(1, "Oblomov");

        double saldo= conta1.depositarDinheiro(100);
        assertEquals(100, saldo);

    }

    @Test
    public void saqueerrado(){
        
        Conta conta1 = new Conta(1, "Oblomov");

        conta1.depositarDinheiro(10);

        String saque= conta1.sacarDinheiro(25);
        assertEquals("Saldo insuficiente", saque);

    }
}
