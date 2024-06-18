public class object {
    public static void main(String[] args){
        produto produto1 = new produto();
        produto1.nome="Notebook";
        produto1.preco=5000;
        produto1.desconto=0.10;

        produto produto2 = new produto();
        produto2.nome="shampoo";
        produto2.preco=30;
        produto2.desconto=0.25;

        System.out.println("preço final dos produtos:" + produto1.nome +  "o preco é " + produto1.calcularPrecoComDesconto());
        produto1.imprimirNomeProduto();

        operacoes operacoes = new operacoes();
        String empresa = operacoes.retornarStringUpperCase("Bosch");


    }
}
