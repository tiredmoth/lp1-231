package semana20.exercicios;

public class Multipla extends Questao {
    private List<String> opcoesCorretas;

    public QuestaoMultiplaEscolha(int numero, String enunciado, List<String> opcoesCorretas) {
        super(numero, enunciado);
        this.opcoesCorretas = opcoesCorretas;
    }

    public List<String> getOpcoesCorretas() {
        return opcoesCorretas;
    }

    public void setOpcoesCorretas(List<String> opcoesCorretas) {
        this.opcoesCorretas = opcoesCorretas;
    }

    }
}

