package exemploArray;

import java.util.Scanner;

public class mainCalculadorageometria {
    public static void main(String[] args) {
        
        System.out.println("+/*-+-*/*-+-*//\n");
        System.out.println("+ Calculadora -\n");
        System.out.println("+/*-+-*/*-+-*//\n");
        Scanner input = new Scanner(System.in);
        System.out.println("escreva seu nome para iniciar: ");
        String nome = input.nextLine();
        CalculadoraGeometrica nome1 = new CalculadoraGeometrica(nome);
        System.out.println("deseja iniciar: ");
        String iniciar = input.nextLine();




        System.out.println("Escolha a opção: \n" +
                "1 - figuras plana. \n" +
                "2 - figuras espaciais.");

        int opcao = input.nextInt();

        int opcaoPlana = 0;
        int opcaoFigEspecial = 0;

        switch (opcao) {
            case 1:
                System.out.println("escolha uma das seguintes opcao: \n" +
                        "1 - quadrado\n" +
                        "2 - retangulo \n" +
                        "3 - triangulo equilatero\n" +
                        "4 - circulo \n" +
                        "5 - hexagono \n");
                opcaoPlana = input.nextInt();
                break;

            case 2:
                System.out.println("escolha uma das seguintes opcao: \n" +
                        "1 - cubo \n" +
                        "2 - paralelepipedo \n" +
                        "3 - esfera \n" +
                        "4 - piramide de base quadrada \n" +
                        "5 - cilindro \n" +
                        "6 - cone");
                opcaoFigEspecial = input.nextInt();
                break;
        }
        switch (opcaoPlana) {
            case 1:
                System.out.println("digite a opcao\n" +
                        "1 - Area\n" +
                        "2 - perimetro\n");
                double opcaoPlana1 = input.nextInt();

                switch ((int) opcaoPlana1){
                    case 1:
                        System.out.println("digite o tamanho do lado");
                        double lado = input.nextDouble();
                        double area = nome1.CalcularQuadradoarea(lado);
                        break;
                    case 2:
                        System.out.println("digite o tamanho do lado");
                        lado = input.nextDouble();
                        double perimetro = nome1.CalcularQuadradoperimetro(lado);
                        break;

                }break;

            case 2:
                System.out.println("digite a opcao\n" +
                        "1 - Area\n" +
                        "2 - perimetro\n");
                opcaoPlana1 = input.nextInt();
                switch ((int) opcaoPlana1){
                    case 1 :
                        System.out.println("digite a base");
                        double base = input.nextDouble();
                        System.out.println("digite a altura");
                        double altura = input.nextDouble();
                        double area = nome1.CalcularRetanguloarea(base, altura);
                        break;
                    case 2:
                        System.out.println("digite a base");
                        base = input.nextDouble();
                        System.out.println("digite a altura");
                        altura = input.nextDouble();
                        double perimetro = nome1.CalcularRetanguloperimetro(base, altura);
                        break;
                }break;
            case 3:
                System.out.println("digite a opcao\n" +
                        "1 - Area\n" +
                        "2 - perimetro\n");
                opcaoPlana1 = input.nextInt();
                switch ((int) opcaoPlana1){
                    case 1:
                        System.out.println("digite o lado do triangulo");
                        Double lado = input.nextDouble();
                        double area = nome1.CalcularTrianguloarea(lado);
                        break;

                    case 2:
                        System.out.println("digite o lado do triangulo");
                        lado = input.nextDouble();
                        double perimetro = nome1.CalcularTrianguloperimetro(lado);
                        break;
                }break;
            case 4:
                System.out.println("digite a opcao\n" +
                        "1 - Area\n" +
                        "2 - perimetro\n");
                opcaoPlana1 = input.nextInt();
                switch ((int) opcaoPlana1){
                    case 1:
                        System.out.println("digite o raio");
                        double raio = input.nextDouble();
                        double area = nome1.CalcularCirculoarea(raio);
                        break;

                    case 2:
                        System.out.println("digite o raio");
                        raio = input.nextDouble();
                        double perimetro = nome1.CalcularCirculoperimetro(raio);
                        break;
                }break;
            case 5:
                System.out.println("digite a opcao\n" +
                        "1 - Area\n" +
                        "2 - perimetro\n");
                opcaoPlana1 = input.nextInt();
                switch ((int) opcaoPlana1){
                    case 1:
                        System.out.println("digite o tamanho do lado");
                        double lado = input.nextDouble();
                        double area = nome1.CalcularHexagonoarea(lado);
                        break;

                    case 2:
                        System.out.println("digite o tamanho do lado");
                        lado = input.nextDouble();
                        double perimetro = nome1.CalcularHexagonoperimetro(lado);
                        break;

                }break;
        }
        switch (opcaoFigEspecial) {
            case 1:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                int FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do lado:");
                        double lado = input.nextDouble();
                        double volume = nome1.CalcularCubovolume(lado);
                        break;

                    case 2:
                        System.out.println("digite o valor da area de superficial:");
                        lado = input.nextDouble();
                        double areaSuperficial = nome1.CalcularCuboaresuperficial(lado);
                        break;
                } break;
            case 2:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do comprimento:");
                        double comprimento = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        double altura = input.nextDouble();
                        System.out.println("digite o valor do largura:");
                        double largura = input.nextDouble();
                        double volume = nome1.CalcularParalelepipidovolume(comprimento,altura, largura);
                        break;

                    case 2:
                        System.out.println("digite o valor do comprimento:");
                        comprimento = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        altura = input.nextDouble();
                        System.out.println("digite o valor do largura:");
                        largura = input.nextDouble();
                        double areaSuperficial = nome1.CalcularParalelepipidoaresuperficial(comprimento,altura, largura);
                        break;
                }break;
            case 3:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do raio:");
                        double raio = input.nextDouble();
                        double volume = nome1.CalcularCilindrovolume(raio);
                        break;

                    case 2:
                        System.out.println("digite o valor do raio:");
                        raio = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        double altura = input.nextDouble();
                        double areaSuperficial = nome1.CalcularCilindroaresuperficial(raio,altura);
                        break;
                }break;
            case 4:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do raio:");
                        double raio = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        double altura = input.nextDouble();
                        double volume = nome1.CalcularConevolume(raio,altura);
                        break;

                    case 2:
                        System.out.println("digite o valor do raio:");
                        raio = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        altura = input.nextDouble();
                        double areaSuperficial = nome1.CalcularConeareasuperficial(raio,altura);
                        break;
                }break;
            case 5:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do area da base:");
                        double areaBase = input.nextDouble();
                        System.out.println("digite o valor do altura:");
                        double altura = input.nextDouble();
                        double volume = nome1.CalcularPiramideBasevolume(areaBase,altura);
                        break;

                    case 2:
                        System.out.println("digite o valor do arestaBase:");
                        double arestaBase = input.nextDouble();
                        System.out.println("digite o valor do apotema:");
                        double apotema = input.nextDouble();
                        double areaSuperficial = nome1.CalcularPiramideBaseareaSuperficial(arestaBase,apotema);
                        break;
                }break;
            case 6:
                System.out.println("digite a opcao\n1 - Volume\n2 - Area superficial\n");
                FigEspecial = input.nextInt();
                switch ((int) FigEspecial) {
                    case 1:
                        System.out.println("digite o valor do raio:");
                        double raio = input.nextDouble();
                        double volume = nome1.CalcularEsferavolume(raio);
                        break;

                    case 2:
                        System.out.println("digite o valor do raio:");
                        raio = input.nextDouble();
                        double areaSuperficial = nome1.CalcularEsferaareasuperficial(raio);
                        break;
                }break;
        }

    }
}
