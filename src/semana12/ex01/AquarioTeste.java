package semana12.ex01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTeste {

    @Test
    public void volumedif(){
        
        Aquario aq1 = new Aquario(10.0, 5.0, 8.0);

        double volume= aq1.calcularVolume();
        assertEquals(0.4, volume);

    }
    @Test
    public void volumeig(){
        
        Aquario aq1 = new Aquario(10.0);

        double volume= aq1.calcularVolume();
        assertEquals(1, volume);

    }
    @Test
    public void potenciadif(){
        
        Aquario aq1 = new Aquario(10.0, 5.0, 8.0);
        double tempdes= 38;
        double tempamb= 28;

        double potencia= aq1.calcularPotencia(tempdes, tempamb);
        assertEquals(0.2, potencia);

    }
    @Test
    public void potenciaig(){
        
        Aquario aq1 = new Aquario(10.0);
        double tempdes= 38;
        double tempamb= 28;

        double potencia= aq1.calcularPotencia(tempdes, tempamb);
        assertEquals(0.5, potencia);

    }
    @Test
    public void filtragensdif(){
        Aquario aq1 = new Aquario(10.0, 5.0, 10.0);

        double filtmin = aq1.Filtragemmin();
        double filtmax = aq1.Filtragemmax();

        assertEquals(1, filtmin);
        assertEquals(1.5, filtmax);
    }
    @Test
    public void filtragensig(){
        Aquario aq1 = new Aquario(10.0);

        double filtmin = aq1.Filtragemmin();
        double filtmax = aq1.Filtragemmax();

        assertEquals(2, filtmin);
        assertEquals(3, filtmax);
    }
    
    
}
