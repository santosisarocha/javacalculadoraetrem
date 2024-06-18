package exemploArray.orient;

import static java.lang.Math.pow;

public class Circulo {
    String cor;
    double raio;
    static final Double pi = 3.14;

    public Circulo(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }



    double calcularArea(){
        return pi*pow(this.raio,2);
    }
}
