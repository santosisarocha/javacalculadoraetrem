package exemploArray;
import java.util.Scanner;
public class condicional {
    public static void main(String[] args) throws InterruptedException{
        double media;
        int faltas;
        boolean postura;
        String situacao;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a média do aluno: ");
        media = input.nextDouble();
        System.out.println("Digite as faltas do aluno: ");
        faltas = input.nextInt();
        System.out.println("Digite a postura do aluno: ");
        postura = input.nextBoolean();

        if (media >= 5.0 && faltas < 25 && postura == true) {
            situacao = "Aprovado";
        } else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação";
        } else if (media >= 5.0 && faltas >= 25 && postura) {
            situacao = "Sem férias";
        } else if (media >= 5.0 && faltas < 25 && postura == false) {
            situacao = "Chamar para conversar";
        } else {
            situacao = "reprovado";
        }
        System.out.println(situacao);

        ////exercicio

        int number;
        System.out.println("Write a number: ");
        number = input.nextInt();

        if (number % 2 == 0 && number % 5 == 0) {
            situacao = "FizzBuss";
        } else if (number % 2 == 0) {
            situacao = "Fizz";
        } else if (number % 5 == 0) {
            situacao = "Buzz";
        } else {
            situacao = "erro!";
        }
        System.out.println(situacao);

        int number1;
        System.out.println("write a number: ");
        number1 = input.nextInt();

        if (number1 % 2 == 0) {
            situacao = "is even ";
        } else {
            situacao = "is odd";

        }
        System.out.println(situacao);

        //wraper
        Byte b = 100;
        Short s = 1000;
        Integer in = 10000;
        Long l = 10000000L;
        System.out.println(b);
        System.out.println(s);
        System.out.println(in);
        System.out.println(l);
        Float f = 123.10F;
        System.out.println(f);
        Double d = 1234.5678;
        System.out.println(d);
        Boolean bo = true;
        System.out.println(bo);
        double a = 1;
        System.out.println(a);
        double fd = 1.122249999;
        float c = (float) fd;
        System.out.println(c);

        Integer num1 = 10000;
        System.out.println(num1.toString());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());
        String text = String.format("o meu salario vai ser %d daqui uns anos", num2);
        System.out.println(text);
        String numero1 = "12";
        String numero2 = "18.5";

        int x = Integer.parseInt(numero1);
        double y = Double.parseDouble(numero2);
        double soma = x + y;
        System.out.println(soma);


        int contatador = 0;
        while (contatador <= 20) {
            System.out.printf("o contador esta em %s\n", contatador);
            contatador++;
        }
        int contador = 30;
        while (contador>=20){
            System.out.printf("o contador esta em %d\n",contador);
            contador--;
        }
        for (int i = 0; i< 20 ; i ++){
            System.out.println(i);
            Thread.sleep(1000);////delay
        }
        int xi = 2;
        for (; xi<10;){
            System.out.println(xi);
            Thread.sleep(1000);////delay
        }

        String valor = "";
        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("digite algo: ");
            valor=input.nextLine();
        }
        input.close();

        do{
            System.out.println("digite algo:");
            valor=input.nextLine();

        }while (!valor.equalsIgnoreCase("sair"));

        int contator=0, acumulador=0;
        while(contator<5){
            contator ++;
            System.out.print("digite um numero:");
            acumulador+=input.nextInt();
            System.out.printf("o acontador esta em %d e o acumulador esta em %d\n",contator,acumulador);
        }

        for(int i = 0; i < 3; ++i) {
            System.out.println("banana");

            for(int j = 0; j < 2; ++j) {
            }

            System.out.println("maça");
        }

    }
}
