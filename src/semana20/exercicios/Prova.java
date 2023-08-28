package semana20.exercicios;
import java.util.List;
import java.util.ArrayList;

public class Prova {

    private List<Questao> questoes;
    private int nota;

    public Prova() {
        questoes = new ArrayList<>();
        nota = 0;
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    
    }

    public int getnota() {
        return nota;
    }

    public void realizarProva() {
        for (Questao questao : questoes) {
            System.out.println(questao);
            // falta adicionar a interação com o usuario ainda
        }
        System.out.println("Pontuação Total: " + nota);
    }
}



