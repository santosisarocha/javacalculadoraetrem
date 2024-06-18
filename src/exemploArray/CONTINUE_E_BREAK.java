package exemploArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CONTINUE_E_BREAK {
    public CONTINUE_E_BREAK() {
    }

    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//            if (i == 5){
//                break;


//            }
//        }
        Scanner input = new Scanner(System.in);
//        String valor = "";
//        while (true){
//            System.out.print("digite algo");
//            valor = input.nextLine();
//
//            if(valor.equalsIgnoreCase("sair")){
//                break;

//        for (int i = 0; i<= 10 ; i++){
//            if (i%2==0){
//                continue;
//            }
//            System.out.print(i);
//        }

//        try
//        int numero;
//        int valor;
//        try {
//            valor=Integer.parseInt("bosch");
//            System.out.println(valor);
//
//        }catch (InputMismatchException e){
////            System.out.println("Ops, voce digitou algo invalido ");
////
//        }catch (NumberFormatException e){
//            System.out.println("Ops, voce digitou algo invalido ");
//
//        }



//        try {System.out.print("DIGITE UM NUMERO: ");
//            numero= input.nextInt();
//            System.out.println(numero);
//
////        }catch (Exception e){
//        }catch (InputMismatchException e){
//            System.out.println("Ops, voce digitou algo invalido ");
//        }
        int numero;
        while (true){
            try{
                System.out.print("digite um numero");
                numero=input.nextInt();
                if(numero<20){
                    System.out.println("so numero maiores ou iguais a 20");
                    continue;
                }
                else{
                    break;
                }

            }
            catch (InputMismatchException e){
                System.out.println("usuario digitou errado , tente novamente:");

            }
            input.nextLine();
        }
        System.out.println("o seu numero é: " + numero);



    }
}


