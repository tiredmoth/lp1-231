package semana14.exsmoodle.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Pessoateste{
    @Test
    public void calculoimc(){
        Pessoa p1 = new Pessoa(1.7, 57.8);
        p1.setAltura(1.7);
        p1.setPeso(57.8);

        double imc = p1.calcularIMC();
        assertEquals(20, imc);

    }
    @Test
    public void imcBaixoPeso(){
        Pessoa p1 = new Pessoa(1.0, 1.0);
        p1.setAltura(1.8);
        p1.setPeso(55.8);
        String classe = p1.getFaixa();
        assertEquals("Baixo peso", classe);

    }
    @Test
    public void imcPesoNormal(){
        Pessoa p1 = new Pessoa(1.2, 0.1);
        p1.setAltura(1.62);
        p1.setPeso(58.3);
        String classe = p1.getFaixa();
        assertEquals("Peso normal", classe);

    }
    @Test
    public void imcExcessoDepeso(){
        Pessoa p1 = new Pessoa(1.55, 68.3);
        p1.setAltura(1.55);
        p1.setPeso(68.3);
        String classe = p1.getFaixa();
        assertEquals("Excesso de peso", classe);

    }
    @Test
    public void imcObesidade1(){
        Pessoa p1 = new Pessoa(1.53, 72.3); 
        p1.setAltura(1.53);
        p1.setPeso(72.3);
        String classe = p1.getFaixa();
        assertEquals("Obesidade de Classe 1", classe);

    }
    @Test
    public void imcObesidade2(){
        Pessoa p1 = new Pessoa(1.57, 89.3);
        p1.setAltura(1.57);
        p1.setPeso(89.3);
        String classe = p1.getFaixa();
        assertEquals("Obesidade de Classe 2", classe);

    }
    @Test
    public void imcObesidade3(){
        Pessoa p1 = new Pessoa(1.48, 90.3);
        p1.setAltura(1.48);
        p1.setPeso(90.3);
        String classe = p1.getFaixa();
        assertEquals("Obesidade de Classe 3", classe);

    }
    @Test
    public void perderPeso(){
        Pessoa p1 = new Pessoa(1.7, 89.6);
        p1.setAltura(1.7);
        p1.setPeso(89.6);
        String pesoperder= p1.getSituacao();
        assertEquals("Perder", pesoperder);

        

    }
    @Test
    public void ganharPeso(){
        Pessoa p1 = new Pessoa(1.7, 41.3);
        p1.setAltura(1.7);
        p1.setPeso(41.3);
        String pesoganhar= p1.getSituacao();
        assertEquals("Ganhar", pesoganhar);

        

    }
    @Test
    public void manterPeso(){
        Pessoa p1 = new Pessoa(1.7, 65);
        p1.setAltura(1.7);
        p1.setPeso(65);
        String pesomanter= p1.getSituacao();
        assertEquals("Normal", pesomanter);

        

    }
    
}