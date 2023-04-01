package semana06exs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EX02Teste {
    @Test
    public void calculoimc(){

        double altura= 1.70;
        double peso= 57.8;

        double imc = EX02.calcularIMC(peso, altura);
        assertEquals(20, imc);

    }
    @Test
    public void imcBaixoPeso(){

        double altura= 1.80;
        double peso= 55.8;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Baixo peso", classe);

    }
    @Test
    public void imcPesoNormal(){

        double altura= 1.62;
        double peso= 58.3;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Peso normal", classe);

    }
    @Test
    public void imcExcessoDepeso(){

        double altura= 1.55;
        double peso= 68.3;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Excesso de peso", classe);

    }
    @Test
    public void imcObesidade1(){

        double altura= 1.53;
        double peso= 72.3;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Obesidade de Classe 1", classe);

    }
    @Test
    public void imcObesidade2(){

        double altura= 1.57;
        double peso= 89.3;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Obesidade de Classe 2", classe);

    }
    @Test
    public void imcObesidade3(){

        double altura= 1.48;
        double peso= 90.3;

        String classe = EX02.classificarIMC(peso, altura);
        assertEquals("Obesidade de Classe 3", classe);

    }
    @Test
    public void perderPeso(){

        double altura= 1.70;
        double peso= 89.6;

        double pesoperder= EX02.mudarPeso(peso, altura);
        assertEquals(36.135, pesoperder);

        

    }
    @Test
    public void ganharPeso(){

        double altura= 1.70;
        double peso= 41.3;

        double pesoganhar= EX02.mudarPeso(peso, altura);
        assertEquals(12.165, pesoganhar);

        

    }
    @Test
    public void manterPeso(){

        double altura= 1.70;
        double peso= 65;

        double pesomanter= EX02.mudarPeso(peso, altura);
        assertEquals(0, pesomanter);

        

    }
}
