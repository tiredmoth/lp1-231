package semana20.exercicios;

public class Verdadeirofalso extends Questao {
    private static final boolean V=true;
    private static final boolean F=false;
    private boolean resposta;
    public Verdadeirofalso(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.setResposta(resposta);
    }
    public double getResposta() {
        return resposta;
    }
    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

}
