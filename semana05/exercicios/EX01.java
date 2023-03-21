package semana05.exercicios;
import java.util.Scanner;
public class EX01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o comprimento do aquário:");
        float comprimento = sc.nextFloat();

        System.out.println("Insira a altura do aquário:");
        float altura = sc.nextFloat();

        System.out.println("Insira a largura do aquário:");
        float largura = sc.nextFloat();

        System.out.println("Insira a temperatura ambiente do aquário:");
        float tempamb = sc.nextFloat();

        System.out.println("Insira a temperatura desejada do aquário:");
        float tempdes = sc.nextFloat();

        sc.close();

        System.out.println("----------Aqui estão as informações do seu aquário:----------");

        float volume= (comprimento*altura*largura)/1000;
        System.out.println("Volume:" + volume + " metros cúbicos");

        float potencia= volume*0.05f*(tempdes-tempamb);
        System.out.println("Potência do termostato:" + potencia + "W");

        float filtrmin= volume*2;
        float filtrmax= volume*3;
        System.out.println("Filtragem por hora:" + filtrmin + " a " + filtrmax + " litros por hora");
        
        
    }
}
