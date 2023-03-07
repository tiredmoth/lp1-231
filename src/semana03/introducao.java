package semana03;

import java.util.Scanner;

public class introducao {
    public static void main (String[]args){
        // Comentário de linha :)
        /*
         * comentário de mais de uma linha :D
         */
// Tipos primitivos

    // inteiros:
    byte n1=100;// 1 byte
    short n2= 3000; // 2 bytes
    int n3= 4000000; // 4 bytes
    long n4= 24334754; // 8 bytes

    // ponto flutuante:
    float nota1 = 9.5f; //4 bytes
    double nota2 = 9.5f; // 8 bytes

    //char:
    char letra= 'A';

    //boolean:
    boolean ligado = true;
    boolean desligado = false;

    //string:
    String palavra = "Slay GirlBoss";
    //letra em maiusculo significa que é uma classe, tem métodos 
    System.out.println(palavra);
    System.out.println(palavra.toLowerCase()); //método que faz a string ficar toda no lowercase
    System.out.println(palavra.toUpperCase()); //método que faz a strimg ficar toda no uppercase

// Variáveis e constantes

    /* tipo nome = valor;
     * ou
     * tipo nome;
     * nome=valor;
     */

     short idade = 30;

     short idade2;
     idade2=30; 

     // de preferência tente dar valor para sua variável o mais rápido possível.

     //Java 10 - Inferêcia de tipos
     var sobrenome = "Santos";
     var idade3 = 25;
     // não é necessário declarar o tipo de variável, ele supõe.

     //Constantes
     final double TESTE = 30.4; //variável mas com um final no começo
     //constantes geralmente tem o nome em capslock

//Entrada e saída de dados
    Scanner sc = new Scanner(System.in); //scanner para receber dados do user
    System.out.println ("Entre com o seu nome:");
    String nomeinfo = sc.nextLine();
    System.out.println ("Entre com a sua idade:");
    short idadeinfo = sc.nextShort();
    System.out.println(nomeinfo + " " + idadeinfo);
    sc.close(); //fecha o objeto Scanner








    }
    
}
