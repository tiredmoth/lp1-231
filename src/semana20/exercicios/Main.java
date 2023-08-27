package semana20.exercicios;
public class Main {

    public static void main(String[] args) {
        Prova prova = new Prova();

        QuestaoVerdadeiroFalso questaoVF = new QuestaoVerdadeiroFalso(1, "Java é uma linguagem de programação.", true);
        QuestaoUnicaEscolha questaoUE = new QuestaoUnicaEscolha(2, "Qual é a capital da França?", "Paris");
        QuestaoMultiplaEscolha questaoME = new QuestaoMultiplaEscolha(3, "Quais desses livros são do período romantista?", opcoesCorretas);
        List<String> opcoesCorretas = new ArrayList<>();
        opcoesCorretas.add("Frankenstein");
        opcoesCorretas.add("Fausto");
        opcoesCorretas.add("Os miseráveis");
        opcoesCorretas.add("Os sofrimentos do jovem Werther");
      

        prova.adicionarQuestao(questaoVF);
        prova.adicionarQuestao(questaoUE);
        prova.adicionarQuestao(questaoME);

        prova.realizarProva();
    }
}
