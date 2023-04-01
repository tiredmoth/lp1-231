package semana06exs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EX01Teste {
    
    @Test
    public void volume(){
        double comprimento= 20;
        double altura= 35;
        double largura= 10;

        double volume= EX01.calcularVolume(comprimento, altura, largura);
        assertEquals(7, volume);

    }
    @Test
    public void potencia(){
        double comprimento= 20;
        double altura= 30;
        double largura= 10;
        double tempdes= 38;
        double tempamb= 28;

        double potencia= EX01.calcularPotencia(comprimento, altura, largura, tempdes, tempamb);
        assertEquals(3, potencia);

    }
    @Test
    public void filtragens(){
        double comprimento= 12;
        double altura= 15;
        double largura= 10;

        double filtmin = EX01.Filtragemmin(comprimento, altura, largura);
        double filtmax = EX01.Filtragemmax(comprimento, altura, largura);

        assertEquals(3.6, filtmin);
        assertEquals(5.4, filtmax);
    }
    
}
