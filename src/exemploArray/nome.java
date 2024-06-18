package exemploArray;

import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String nome, sobrenome;
        int idade;
        System.out.print("digite seu nome:");
        nome = input.nextLine();
        System.out.print("digite seu idade:");
        idade = input.nextInt();
        input.nextLine();
        System.out.print("digite seu sobrenome:");
        sobrenome = input.nextLine();
        System.out.printf("o cidadao %s %s tem a idade %d anos",nome,sobrenome,idade);

//        String nome;
//        System.out.print("\n digite seu nome :");
//        nome = input.nextLine();
//        System.out.println("SEU NOME É : " + nome);
//        input.close();
}


}


