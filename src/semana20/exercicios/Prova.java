package semana20.exercicios;

public class Prova {

    private List<Questao> questoes;
    private int pontuacaoTotal;

    public Prova() {
        questoes = new ArrayList<>();
        pontuacaoTotal = 0;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
        pontuacaoTotal += questao.calcularPontuacao();
    }

    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }

    public void realizarProva() {
        for (Questao questao : questoes) {
            System.out.println(questao);
            // Aqui você pode adicionar lógica para interação com o usuário, receber respostas, etc.
        }
        System.out.println("Pontuação Total: " + pontuacaoTotal);
    }
}

public class Main {

    public static void main(String[] args) {
        Prova prova = new Prova();

        QuestaoVerdadeiroFalso questaoVF = new QuestaoVerdadeiroFalso(1, "Java é uma linguagem de programação.", true);
        QuestaoUnicaEscolha questaoUE = new QuestaoUnicaEscolha(2, "Qual é a capital da França?", "Paris");
        List<String> opcoesCorretas = new ArrayList<>();
        opcoesCorretas.add("Laranja");
        opcoesCorretas.add("Maçã");
        QuestaoMultiplaEscolha questaoME = new QuestaoMultiplaEscolha(3, "Quais frutas são amarelas?", opcoesCorretas);

        prova.adicionarQuestao(questaoVF);
        prova.adicionarQuestao(questaoUE);
        prova.adicionarQuestao(questaoME);

        prova.realizarProva();
    }
}


