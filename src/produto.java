public class produto {
    String nome;
    double preco;
    double desconto;

    double calcularPrecoComDesconto(){
        double valorFinal=preco-(preco*desconto);

        return valorFinal;

    }

    void imprimirNomeProduto(){
        System.out.println(nome);
    }

}
