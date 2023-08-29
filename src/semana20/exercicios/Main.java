package semana20.exercicios;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Prova prova = new Prova();

        Verdadeirofalso questaoVF = new Verdadeirofalso(1, "'O declínio de um homem' é um livro escrito por Osamu Dazai.", true);

        List<String> opcoesErradasUE = new ArrayList<>();
        opcoesErradasUE.add("Oblomóv");
        opcoesErradasUE.add("Pais e filhos");
        opcoesErradasUE.add("A morte de Ivan Ilitch");
        opcoesErradasUE.add("Os irmãos Karamazov");
        Unica questaoUE = new Unica(2, "Qual desses livros é de Dostoiévski?", "Os irmãos Karamazov" , opcoesErradasUE);

        List<String> opcoesCorretas = new ArrayList<>();
        opcoesCorretas.add("Frankenstein");
        opcoesCorretas.add("Fausto");
        opcoesCorretas.add("Os miseráveis");
        opcoesCorretas.add("Os sofrimentos do jovem Werther");
         List<String> opcoesErradas = new ArrayList<>();
        opcoesErradas.add("Crime e Castigo");
        opcoesCorretas.add("Frankenstein");
        opcoesErradas.add("O estrangeiro");
        opcoesCorretas.add("Fausto");
        opcoesCorretas.add("Os miseráveis");
        opcoesErradas.add("Metamorfose");
        opcoesCorretas.add("Os sofrimentos do jovem Werther");
        Multipla questaoME = new Multipla(3, "Quais desses livros são do período romantista?", opcoesCorretas, opcoesErradas);
      
      
        prova.adicionarQuestao(questaoVF);
        prova.adicionarQuestao(questaoUE);
        prova.adicionarQuestao(questaoME);

        prova.realizarProva();

    }
}
