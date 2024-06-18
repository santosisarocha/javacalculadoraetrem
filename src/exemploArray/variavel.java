package exemploArray;

import java.util.Scanner;

public class variavel {
    public static void main(String[] args) {
        String minhaString = "Like a Bosch";
        System.out.println(minhaString.concat("!"));
        minhaString = minhaString.concat("!");
        System.out.println(minhaString);
        System.out.println(minhaString.length());
        System.out.println(minhaString.charAt(12));
        System.out.println(minhaString.startsWith("L"));
        System.out.println(minhaString.endsWith("Bosch"));
        System.out.println(minhaString.toUpperCase());
        System.out.println(minhaString.toLowerCase());

        String variavel = "\033[1;30;46m";
        System.out.println(variavel+"Texto");
        String reset = "\033[0m";
        String negritoVermelhoPreto = "\033[1;31;40m";
        System.out.println(negritoVermelhoPreto.concat("Texto"));
        System.out.println(reset+"texto2");

        String myString= "Like a bosch ";
        System.out.println(10==5+5);
        System.out.println('A'=='a');
        System.out.println(myString == "Like a Bosch");

        String minhaString2;
        Scanner input = new Scanner(System.in);
        minhaString2=input.nextLine();
        System.out.println(minhaString2.equals("Like a Bosch"));

        //operador de igualdade
        System.out.println(10==10);

        //operador de diferença
        System.out.println(12!=13);

        //maior que
        System.out.println(20>10);

        //menor que
        System.out.println(20<10);

        //maior ou igual que

        System.out.println(25>=25);

        //menor ou igual

        System.out.println(25<=25);

        //operadores logicos: and

        boolean condicao1 = true;
        boolean condicao2 = 15<12;
        System.out.println(condicao1);
        System.out.println(condicao2);
        //and
        System.out.println(condicao1 && condicao2);
        //or
        System.out.println(condicao1 || condicao2);
        //not
        System.out.println(!condicao1);
        System.out.println(!condicao2);
        //xor
        System.out.println(condicao1^condicao2);



    }
}
