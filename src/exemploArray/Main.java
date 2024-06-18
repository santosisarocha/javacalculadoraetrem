package exemploArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //byte

        byte mybyte1 = 126;
        byte mybyte2 = 125;
        byte mybyte3 = 127;
        System.out.printf(" meu byte e  %d e %d e %d",mybyte1,mybyte2,mybyte3);

        //short

        short myshort = 32766;
        System.out.printf("\n tamanho do short : %d",myshort);

        //int

        int myint = 2147483564;
        System.out.printf("\n tamanho do int: %d",myint);

        //long

        long mylong = 9223372036854775807L;
        System.out.printf("\n eese e o tamanho do long: %d",mylong);

        //float

        float myfloat = 3.14F;
        System.out.printf("\n valor do float: %f", myfloat);

        //double

        double mydouble = 1.7e+308;
        System.out.printf("\n valor do double: %f", mydouble);

        //booleano

        boolean myboolean = true;
        System.out.printf("\n my booleano and: %b", myboolean);

        //char

        char myCaracter = 'a';
        System.out.printf("\n my caracter and %c", myCaracter);

        //string

        String mystring = "Bosch";
        System.out.printf("\n my string and: %s", mystring);

        // pedir para o usuario inserir um numero


        Scanner input = new Scanner(System.in);
        int numero;
         System.out.print("\n digite um numero:");
         numero=input.nextInt();
         System.out.println("o numero que vc digitou foi: " + numero);
         input.close();

         //pedir uma palavra
        Scanner input1= new Scanner(System.in);
        String nome;
        System.out.print("\n digite seu nome :");
        nome=input1.nextLine();
        System.out.println("SEU NOME É : " + nome);
        input1.close();


	// write your code here
    }
}
