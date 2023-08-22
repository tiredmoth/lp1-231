package semana20.exercicios;

public class Unica extends Questao {
    private String opcaoCorreta;

    public Unica(int numero, String enunciado, String opcaoCorreta) {
        super(numero, enunciado);
        this.opcaoCorreta = opcaoCorreta;
    }

    public String getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(String opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }

    @Override
    public int calcularPontuacao() {
        return 1;
    }
}


}
