package exemploArray;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trem {
    private static Math math;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("___\uD83D\uDE82______Deseja começar o programa ? 1 = sim___0 = nao______");
        int prog = input.nextInt();

        while (prog == 1) {
            System.out.println("Digite o numero de onde o trem A vai começar, O VALOR TEM QUE SER DE 0 A 10.000: ");
            double começo_tremA = input.nextDouble();
            System.out.println("Digite o numero da velocidade do trem A, O VALOR TEM QUE SER POSITIVO: ");
            double velocidade_tremA = input.nextDouble();
            System.out.println("Digite o numero de onde o trem B vai começar, O VALOR TEM QUE SER DE 0 A 10.000: ");
            double começo_tremB = input.nextDouble();
            System.out.println("Digite o numero da velocidade do trem B, O VALOR TEM QUE SER NEGATIVA: ");
            double velocidade_tremB = input.nextDouble();

            try {
                if (começo_tremA >= 0 || começo_tremA <= 10000 && começo_tremB > 0 || começo_tremB < 10000) {
                    double velocidaA = Math.abs(velocidade_tremA);
                    double velocidaBb = Math.abs(velocidade_tremB);
                    double velocidaB = velocidaBb * -1;


                    if (velocidaA <= 300 && velocidaB >= -300) {
                        double tempo = (começo_tremA - começo_tremB) / (velocidaB - velocidaA);
                        double equacaoA = começo_tremA + (velocidaA * tempo);
                        double equacaoB = começo_tremB + (velocidaB * tempo);

                        double segtotal = tempo * 3600;
                        double horatotal = 17 * 3600 + segtotal;
                        double hora = horatotal / 3600;
                        double resto = segtotal % 3600;
                        double min = resto / 60;
                        double seg = resto % 60;

                        System.out.println("\uD83D\uDCA5 a colição dos trens acontecerá na posicao : " + equacaoA);
                        System.out.println("ocorrera após " + segtotal + hora + ":" + min + ":" + seg + "\uD83D\uDCA5");
                        System.out.println("_________Deseja começar o programa ? 1 = sim___ 0 = nao______");
                        prog = input.nextInt();
                        if (prog == 1) {
                            prog = 1;

                        } else {
                            break;
                        }


                    } else {
                        System.out.println("o maximo da velocidade é 300");
                    }

                } else {
                    System.out.println("so numeros entre 0 a 10000");
                }

            } catch (InputMismatchException nexc){
                System.out.println("nao coloca letra otario");
            }

        }

        }

}

