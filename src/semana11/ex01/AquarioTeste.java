package semana11.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste {
    
    @Test
    public void volume(){
        
        Aquario aq1 = new Aquario();
        aq1.comprimento = 100.0;
        aq1.altura = 5.0;
        aq1.largura = 8.0;

        double volume= aq1.calcularVolume();
        assertEquals(4, volume);

    }
    @Test
    public void potencia(){
        Aquario aq1 = new Aquario();
        aq1.comprimento = 20.0;
        aq1.altura = 30.0;
        aq1.largura = 10.0;

        double tempdes= 38;
        double tempamb= 28;

        double potencia= aq1.calcularPotencia(tempdes, tempamb);
        assertEquals(3, potencia);

    }
    @Test
    public void filtragens(){
        Aquario aq1 = new Aquario();
        aq1.comprimento = 12.0;
        aq1.altura = 15.0;
        aq1.largura = 10.0;

        double filtmin = aq1.Filtragemmin();
        double filtmax = aq1.Filtragemmax();

        assertEquals(3.6, filtmin);
        assertEquals(5.4, filtmax);
    }
    
}
