package semana06;
public class Metodos {
    public static void main(String[] args){

        System.out.println(Math.sqrt(25.0));
        // estou chamando um método criado por outra pessoa, e não criando o meu próprio

        imprimirPalavra("girlboss skinny legend slay queen!!!");
        // dessa vez estou chamando um método que eu mesma criei


        System.out.println("a soma dos dois é:" + Calculadora.somarNumeros(69,420));
        // não precisamos usar import pq tá no mesmo package

        //demais funções da calculadora: (exercício da aula)

        System.out.println("a soma dos dois é:" + Calculadora.subtrairNumeros(10,5));

        System.out.println("a soma dos dois é:" + Calculadora.multiplicarNumeros(7,42));

        System.out.println("a soma dos dois é:" + Calculadora.dividirNumeros(69,3));

    }

    public static void imprimirPalavra (String palavra) {

        // dessa vez estou criando a meu próprio método 
        // P.S: um método é uma função dentro de uma classe, basicamente

        // Assinatura da função:
        //public: acesso em qualquer parte do projeto
        //static: método atrelado a classe (não precisa criar um objeto)
        // void: sigifica que nada será retornado
        //imprimirPalavra: nome do método
        //String palavra: parâmetro

        System.out.println(palavra.toUpperCase());
    }
}