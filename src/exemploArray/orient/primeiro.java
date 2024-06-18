package exemploArray.orient;


public class primeiro {
    public static void main(String[] args) {
        Colaborador maria = new Colaborador();
        maria.nome = "Maria";
        maria.cargo = "Técnica de qualidade";
        maria.edv = 9289223;
        System.out.println(maria.nome);

        Colaborador jose = new Colaborador("José");
        System.out.println(jose.nome);

        Colaborador antonio = new Colaborador(9929292,"Antonio");
        System.out.println(antonio.nome);

        Colaborador isabela = new Colaborador(92903535, "Isabela", "Aprendiz Digital Solutions");
        System.out.println("\n*** Informações do Colaborador ***");
        System.out.println("Nome: " + isabela.nome);
        System.out.println("Cargo: " + isabela.cargo);
        System.out.println("EDV: " + isabela.edv);

        System.out.println("\n" + isabela);

        Treinamento treinamento = new Treinamento("UX/UI", 992, false, new Instrutor("Leonardo"));
        System.out.println(treinamento);

        Investimento.taxaDeRentabilidade = 0.05;

        Investimento investimento1 = new Investimento("isabela", 1000);
        System.out.println("saldo do investimento "+ investimento1.nomeDoInvestidor + "antes de rendelizar: " + investimento1.saldoAtual);

        investimento1.rentabilizar();
        System.out.println("saldo do investimento"+ investimento1.nomeDoInvestidor +" apos rendelizar: " + investimento1.saldoAtual);



        Investimento investimento2 = new Investimento("murilo",100);
        System.out.println("saldo do investimento "+ investimento2.nomeDoInvestidor + "antes de rendelizar: " + investimento2.saldoAtual);
        investimento2.rentabilizar();
        System.out.println("saldo do investimento"+ investimento2.nomeDoInvestidor +" apos rendelizar: " + investimento2.saldoAtual);




    }
}
