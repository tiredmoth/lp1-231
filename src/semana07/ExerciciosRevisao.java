package semana07;
import java.util.Arrays;

public class ExerciciosRevisao{

    public static double ex01 (double num1, double num2, double num3){
        return num1 + num2+ num3 ; 
    }

    public static double ex02 (double num1, double num2, double num3){
        return (num1 + num2+ num3)/3 ; 
    }

    public static double ex03 (double num1, double num2, double num3){
        return Math.max(num1, Math.max(num2, num3 )) ;   
    }

    public static double ex04 (double num1, double num2, double num3){
        return Math.min(num1, Math.min(num2, num3 )) ;   
    }

    public static double[] ex05 (double num1, double num2, double num3){
        double array[] = {num1, num2, num3};
        return array;
    }

    public static double ex06 ( double[] array ){
        double soma = 0.0;
        for (double i : array)
        soma += i;
        return soma;
    }

    public static double ex07 ( double[] array ){
        double soma = 0.0;
        for (double i : array)
        soma += i;
        return soma/array.length;
    }

    public static double ex08 ( double[] array){
        Arrays.sort(array);     
        return array[array.length];   
    }

    public static double ex09 ( double[] array){
        Arrays.sort(array);     
        return array[0];   
    }


    public static int[] ex10 ( int[] array1, int[] array2){
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        return array3;
 
    }

    public static void main(String[] args){
        double n1= 1;
        double n2 = 2;
        double n3 = 3;

        double array1[] = {1, 2, 3};

        int array2[] = {4, 5, 6};
        int array3[] = {7, 8, 9};
        
        System.out.println(ex01(n1, n2, n3));

        System.out.println(ex02(n1, n2, n3));

        System.out.println(ex03(n1, n2, n3));

        System.out.println(ex04(n1, n2, n3));
        
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array3);
        




    }
}