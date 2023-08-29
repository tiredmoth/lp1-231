package semana21;
import java.util.ArrayList;

public class Tela {
    //private ArrayList<Quadrado> quadrados;
    //private ArrayList<Retangulo> retangulos;

    private ArrayList<Figurageometrica> figuras;

    public Tela(){
        // quadrados = new ArrayList<>();
        // retangulos = new ArrayList<>();
        figuras = new ArrayList<>();
    }

   /*  public void addQuadrado(Quadrado q){

        quadrados.add(q);

    }
    
    public void addRetangulo(Retangulo r){

        retangulos.add(r);

    } */

    public void addFigurageometrica (Figurageometrica f){
        figuras.add(f);
    }
    
    
    public double totalArea(){

    double total=0.0;
    
    /*for (Retangulo r : retangulos){
        total += r.calcularArea();
    }
    for (Quadrado q : quadrados){
        total += q.calcularArea();
    }
    */

    for (Figurageometrica f :figuras){
        total+= f.calcularArea();
    }

    return total;
    }
}
