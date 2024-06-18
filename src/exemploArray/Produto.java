package exemploArray;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nome1){
        System.out.println("isso mostra que o contruroe é sempre executado ao instanciar uma classe ");
        nome = nome1;
    }
    Produto(double preco){
        this.preco = preco;

    }

    double calcularcomdesconto(){
        return preco - (preco*desconto);
    }
    String resumoProduto(){
        return String.format("o produto %s esta com"+"o preco %f",nome,preco);
    }
    void dobrarprecodoproduto(){
        preco = preco*2;
    }
    void multiplicarproduto(int fator){
        preco = preco*fator;
    }
}
