package semana14.exsmoodle.ex03;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTeste {
    
    @Test
    public void deposito(){
        
        Conta conta1 = new Conta(1, "Oblomov");
      
        conta1.depositarDinheiro(100);
        assertEquals(100, conta1.saldo);

    }

    @Test
    public void saquesaldoinsuficiente(){
        
        Conta conta1 = new Conta(1, "Oblomov");

        conta1.depositarDinheiro(10);
        

    }

    @Test
    public void saquecerto(){
        
        Conta conta1 = new Conta(1, "Oblomov");

        conta1.depositarDinheiro(100);
        conta1.sacarDinheiro(25);

        assertEquals(75, conta1.saldo);

    }

    @Test
    public void transferirsaldoinsuficiente(){
        
        Conta conta1 = new Conta(1, "Toupeira");

        conta1.depositarDinheiro(5);
        String saque= conta1.transferirDinheiro(7);

        assertEquals("Saldo insuficiente", saque);conta1.transferirDinheiro(25);

    }

    @Test
    public void transferircerto(){
        
        Conta conta1 = new Conta(1, "Kátia");

        conta1.depositarDinheiro(100000);
        conta1.transferirDinheiro(3000);

        assertEquals(97000, conta1.saldo);


    }
}