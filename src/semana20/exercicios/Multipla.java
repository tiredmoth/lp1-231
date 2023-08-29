package semana20.exercicios;

import java.util.List;

public class Multipla extends Questao {
    private List<String> opcoesCorretas;
    private List<String> opcoes;

    public Multipla(int numero, String enunciado, List<String> opcoesCorretas, List<String> opcoes) {
        super(numero, enunciado);
        this.setOpcoesCorretas(opcoesCorretas);
        this.setOpcoes(opcoes);
    }

    public List<String> getOpcoesCorretas() {
        return opcoesCorretas;
    }

    public void setOpcoesCorretas(List<String> opcoesCorretas) {
        this.opcoesCorretas = opcoesCorretas;
    }

    public void setOpcoes(List<String> opcoes) {
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
        
        for (int i = 0; i<opcoesCorretas.size(); i++){
            if(termo== opcoesCorretas.get(i)){
                return true;
            } 
        }
        return false;
    }

    

}


