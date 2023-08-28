package semana20.exercicios;

public class Verdadeirofalso extends Questao {
    
    private boolean resposta;
    public Verdadeirofalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.setResposta(resposta);
    }
    public boolean getResposta() {
        return resposta;
    }
    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    public boolean vf(char termo){
        if(termo== 'v' && termo=='V' && resposta){
            return true;
        } else 
        if(termo== 'f' && termo=='F' && !resposta){
            return true;
        }
        return false;
    }

}
