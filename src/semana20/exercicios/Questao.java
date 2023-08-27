package semana20.exercicios;

public abstract class Questao{

    private int numero;
    private String enunciado;
    private int nota;

    public Questao(int numero, String enunciado) {
        this.setNumero(numero);
        this.setEnunciado(enunciado);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(enunciado) {
        this.enunciado = enunciado;
    }

    public int ganharponto(nota){
        return nota=nota+1;
    }
}
