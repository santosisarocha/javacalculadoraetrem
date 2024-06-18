package exemploArray.orient;

public class Investimento {
    String nomeDoInvestidor;
    double saldoAtual;
    static double taxaDeRentabilidade = 0.02;

    Investimento(String nomeDoInvestidor, double saldoAtual) {
        this.nomeDoInvestidor = nomeDoInvestidor;
        this.saldoAtual = saldoAtual;
    }

    void rentabilizar(){
        this.saldoAtual = saldoAtual *(1+taxaDeRentabilidade);
    }

}
