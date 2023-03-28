package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    
        @Test
        public void somaDoisNumerosPositivos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 3.0;
            double n2 = 5.2;

            //Act:

            double soma = Calculadora.somarNumeros(n1, n2);

            //Assert:

            assertEquals(8.2, soma);

        }

        // é uma boa prática só ter um assert por teste :)
        @Test
        public void somaNumeroPositivoNegativo(){

            //Arrange:

            double n1= 18.0;
            double n2 = -3.0;

            //Act:

            double soma = Calculadora.somarNumeros(n1, n2);

            //Assert:

            assertEquals(15.0, soma);



        }

        @Test
        public void somaDoisNumerosNegativos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= -3.0;
            double n2 = -5.0;

            //Act:

            double soma = Calculadora.somarNumeros(n1, n2);

            //Assert:

            assertEquals(-8, soma);

        }

        @Test
        public void subDoisNumerosPositivos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = 3.0;

            //Act:

            double sub = Calculadora.subtrairNumeros(n1, n2);

            //Assert:

            assertEquals(5.0, sub);

        }

        @Test
        public void subDoisNumerosNegativos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= -8.0;
            double n2 = -3.0;

            //Act:

            double sub = Calculadora.subtrairNumeros(n1, n2);

            //Assert:

            assertEquals(-5.0, sub);

        }

        @Test
        public void subNumeroPositivoNegativo(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = -4.0;

            //Act:

            double sub = Calculadora.subtrairNumeros(n1, n2);

            //Assert:

            assertEquals(12.0, sub);

        }

        @Test
        public void multDoisNumerosPositivos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = 3.0;

            //Act:

            double mult = Calculadora.multiplicarNumeros(n1, n2);

            //Assert:

            assertEquals(24.0, mult);

        }

        @Test
        public void multDoisNumerosNegativos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= -8.0;
            double n2 = -3.0;

            //Act:

            double mult = Calculadora.multiplicarNumeros(n1, n2);

            //Assert:

            assertEquals(24.0, mult);

        }

        @Test
        public void multNumeroPositivoNegativo(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = -3.0;

            //Act:

            double mult = Calculadora.multiplicarNumeros(n1, n2);

            //Assert:

            assertEquals(-24.0, mult);

        }

        @Test
        public void divDoisNumerosPositivos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = 4.0;

            //Act:

            double div = Calculadora.dividirNumeros(n1, n2);

            //Assert:

            assertEquals(2.0, div);

        }
        @Test
        public void divDoisNumerosNegativos(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= -8.0;
            double n2 = -4.0;

            //Act:

            double div = Calculadora.dividirNumeros(n1, n2);

            //Assert:

            assertEquals(2.0, div);

        }

        @Test
        public void divNumeroPositivoNegativo(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = -4.0;

            //Act:

            double div = Calculadora.dividirNumeros(n1, n2);

            //Assert:

            assertEquals(-2.0, div);

        }

        @Test
        public void divPorzero(){
            // AAA
            // Arrange, Act, Assert

            //Arrange:

            double n1= 8.0;
            double n2 = 0.0;

            //Act:

            double div = Calculadora.dividirNumeros(n1, n2);

            //Assert:

            double infinity = Double.POSITIVE_INFINITY;
            assertEquals(infinity, div);

        }

    
}
