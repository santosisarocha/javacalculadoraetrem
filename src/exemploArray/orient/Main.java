package exemploArray.orient;

public class Main {
    public static void main(String[] args){
       Chaveiro isabela = new Chaveiro("roxo",01);
        System.out.println("o cheveiro foi criado");
        System.out.println("a cor : " + isabela.cor);
        System.out.println("a numero : " + isabela.numero);
        System.out.println("a lugar : " + isabela.lugar);
        System.out.println("a sala : " + isabela.sala);

        Circulo circulo1 = new Circulo("roxo", 2.0);
        System.out.println("o circulo é :"+circulo1.cor +" o raio é "+ circulo1.raio );
        System.out.println("e area é" );
        System.out.println(circulo1.calcularArea());

        Circulo circulo2 = new Circulo("azul", 4.0);
        System.out.println("o circulo é :"+circulo2.cor +" o raio é "+ circulo2.raio );
        System.out.println("e area é" );
        System.out.println(circulo2.calcularArea());
        System.out.println("\ncontagem da licenca atual: " + Licenca.retornaLicencaAtribuidas());

        Licenca windowns = new Licenca("windowns", "CaP/ETS");
        System.out.println("contagem da licenca depois windowns: " + Licenca.retornaLicencaAtribuidas());
        Licenca docker = new Licenca("docker", "BD/XD");
        System.out.println("contagem da licenca depois docker: " + Licenca.retornaLicencaAtribuidas());



    }
}
