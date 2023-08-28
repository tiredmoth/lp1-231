package semana20.exercicios;
import java.util.List;

public class Unica extends Questao {
    private String opcaoCorreta;
    private List<String> opcoesErradas;

    public Unica(int numero, String enunciado, String opcaoCorreta, List<String> opcoesErradas) {
        super(numero, enunciado);
        this.opcaoCorreta = opcaoCorreta;
        this.setOpcoesErradas(opcoesErradas);
    }

    public String getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(String opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }
    public void setOpcoesErradas(List<String> opcoesErradas) {
        this.opcoesErradas = opcoesErradas;
    }

    public List<String> getOpcoesErradas() {
        return opcoesErradas;
    }
    
    public boolean isCorrect(String resposta){
        if(resposta == opcaoCorreta){
            return true;
        }
        return false;
    }

}
