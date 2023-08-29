package semana20.exercicios;
import java.util.List;

public class Unica extends Questao {
    private String opcaoCorreta;
    private List<String> opcoes;

    public Unica(int numero, String enunciado, String opcaoCorreta, List<String> opcoes) {
        super(numero, enunciado);
        this.opcaoCorreta = opcaoCorreta;
        this.setopcoes(opcoes);
    }

    public String getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(String opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }
    public void setopcoes(List<String> opcoes) {
        this.opcoes = opcoes;
    }

    public List<String> getopcoes() {
        return opcoes;
    }

    @Override
    
    public void printEnunciado(){
        System.out.println(enunciado +"\n-"+opcoes);
    }

    @Override
    public boolean isCorrect(String termo){
        if(termo== opcaoCorreta){
            return true;
        } 
        return false;
    }

}
