package exemploArray;

public class CalculadoraGeometrica<area, perimetro> {
    String nome;
    double area;
    double perimetro;
    double volume;
    double areaSuperficial;

    CalculadoraGeometrica(String nome){
        this.nome = nome;
    }

    double CalcularQuadradoarea(double lado){
        area = Math.pow(lado,2);
        double area1 = area;

        double par = area%2;
        if (par == 0) {
            System.out.printf(this.nome + " O VALOR É %.2f\n", area);
        }
        else{

            System.out.printf(this.nome + "%.2f\n",area1);
        }
        return area;
    }

    double CalcularQuadradoperimetro(double lado){
        perimetro = 4 * lado;
        double par = perimetro%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f", perimetro);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , perimetro);
        }
        return perimetro;
    }

    double CalcularRetanguloarea(double base, double altura){
        area = base * altura;
        double par = area%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f", area);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , area);
        }
        return area;
    }
    double CalcularRetanguloperimetro(double base, double altura){
        perimetro =(2*base)+(2*altura) ;
        double par = perimetro%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f " , perimetro);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , perimetro);
        }
        return perimetro;
    }
    double CalcularTrianguloarea(double lado){
        area = lado * (Math.sqrt(3/4));
        double par = area%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , area);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , area);
        }
        return area;
    }
    double CalcularTrianguloperimetro(double lado){
        perimetro = lado * 3;
        double par = perimetro%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , perimetro);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , perimetro);
        }
        return perimetro;
    }
    double CalcularCirculoarea(double raio){
        area = Math.PI*(Math.pow(raio, 2));
        double par = area%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , area);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , area);
        }
        return area;
    }
    double CalcularCirculoperimetro(double raio){
        perimetro = 2 * Math.PI*raio;
        double par = perimetro%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , perimetro);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , perimetro);
        }
        return perimetro;
    }
    double CalcularHexagonoarea(double lado){
        area = 6 * lado * (Math.sqrt(3/4));
        double par = area%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , area);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , area);
        }
        return area;
    }
    double CalcularHexagonoperimetro(double lado){
        perimetro = lado * 6;
        double par = perimetro%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , perimetro);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , perimetro);
        }
        return perimetro;
    }
    double CalcularCubovolume(double lado){
        volume = Math.pow(lado,2);
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , volume);
        }
        return volume;
    }
    double CalcularCuboaresuperficial(double lado){
        areaSuperficial = Math.pow(lado,2) * 6;
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , areaSuperficial);
        }
        return areaSuperficial;
    }

    double CalcularParalelepipidovolume(double comprimento, double altura, double largura){
        volume = comprimento * altura * largura;
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" ,volume);
        }
        return volume;
    }
    double CalcularParalelepipidoaresuperficial(double comprimento, double altura, double largura){
        areaSuperficial = 2*((comprimento*altura)+(altura*largura)+(comprimento*largura));
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , areaSuperficial);
        }
        return areaSuperficial;
    }
    double CalcularCilindrovolume(double raio){
        volume = Math.PI*(Math.pow(raio,2));
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f", volume);
        }
        return volume;
    }
    double CalcularCilindroaresuperficial(double raio, double altura){
        areaSuperficial = (2*Math.PI*raio*altura)+(2*Math.PI*Math.pow(raio,2));
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , areaSuperficial);
        }
        return areaSuperficial;
    }
    double CalcularConevolume(double raio, double altura){
        volume = (1/3)*Math.PI*(Math.pow(raio,2))*altura;
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , volume);
        }
        return volume;
    }
    double CalcularConeareasuperficial(double raio, double altura){
        areaSuperficial = Math.PI*raio*(Math.sqrt((Math.pow(altura,2)+(Math.pow(raio,2)))));
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , areaSuperficial);
        }
        return areaSuperficial;
    }
    double CalcularPiramideBasevolume(double areaBase, double altura){
        volume = (areaBase*altura)/3;
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , volume);
        }
        return volume;
    }
    double CalcularPiramideBaseareaSuperficial(double arestaBase, double apotema){
        areaSuperficial = (2*arestaBase*apotema)+Math.pow(arestaBase,2);
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" , areaSuperficial);
        }
        return areaSuperficial;
    }
    double CalcularEsferavolume(double raio){
        volume = (4/3)*(Math.pow(raio,3));
        double par = volume%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f", volume);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f" ,volume);
        }
        return volume;
    }
    double CalcularEsferaareasuperficial(double raio){
        areaSuperficial = (4/3)*Math.pow(raio, 3);
        double par = areaSuperficial%2;
        if (par == 0) {
            System.out.printf(this.nome +" O VALOR É %.2f" , areaSuperficial);
        }
        else{
            System.out.printf(this.nome +" o valor é %.2f", areaSuperficial);
        }
        return areaSuperficial;
    }


}
