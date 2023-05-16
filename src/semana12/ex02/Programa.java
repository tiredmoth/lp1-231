package semana12.ex02;

public class Programa {

    public static void main(String[] args){
Pessoa p1 = new Pessoa(172, 70.3);

double imc = p1.calcularIMC();
String faixa = p1.getFaixa();
String situacao = p1.getSituacao(); // "GANHAR" = ganhar peso, "PERDER" = perder peso, "NORMAL" = peso ok
    
System.out.println(imc);
System.out.println(faixa);
System.out.println(situacao);
}
}