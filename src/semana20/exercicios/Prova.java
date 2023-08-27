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



