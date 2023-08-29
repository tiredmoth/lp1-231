package semana20.exercicios;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Prova {

    private List<Questao> questoes;
    private int nota;

    public Prova() {
        questoes = new ArrayList<>();
        nota = 0;
    }

    public void adicionarQuestao(Questao q) {
        questoes.add(q);
    
    }

    public int getnota() {
        return nota;
    }

    public void realizarProva() {
        for (Questao q : questoes) {
            q.printEnunciado();
            Scanner sc = new Scanner(System.in);
            String resposta = sc.nextLine();
            sc.close();
            if (q.isCorrect(resposta)==true){
                nota++;
            }
        }
        System.out.println("Pontuação Total: " + nota);
    }
}



