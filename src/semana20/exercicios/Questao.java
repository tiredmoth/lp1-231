package semana20.exercicios;

public abstract class Questao{

    private int numero;
    private String enunciado;

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

    public LocalDate getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(enunciado) {
        this.enunciado = enunciado;
    }

    public abstract int calcularPontuacao();

    @Override
    public String toString() {
        return "[" + numero + "] " + enunciado;
    }