package semana20.exercicios;

import java.util.List;

public class Multipla extends Questao {
    private List<String> opcoesCorretas;
    private List<String> opcoesErradas;

    public Multipla(int numero, String enunciado, List<String> opcoesCorretas, List<String> opcoesErradas) {
        super(numero, enunciado);
        this.setOpcoesCorretas(opcoesCorretas);
        this.setOpcoesErradas(opcoesErradas);
    }

    public List<String> getOpcoesCorretas() {
        return opcoesCorretas;
    }

    public void setOpcoesCorretas(List<String> opcoesCorretas) {
        this.opcoesCorretas = opcoesCorretas;
    }

    public void setOpcoesErradas(List<String> opcoesErradas) {
        this.opcoesErradas = opcoesErradas;
    }

    public List<String> getOpcoesErradas() {
        return opcoesErradas;
    }

    

}


