package exemploArray;

public class main_produto {
    public static void main(String[] args) {
        Produto p1 = new Produto("PC");
        System.out.println(p1.nome);
        p1.nome = "notebook";
        p1.preco = 5000;
        p1.desconto = 0.10;
        double precodesconto = p1.calcularcomdesconto();
        System.out.println(precodesconto);
        System.out.println(p1.resumoProduto());
        p1.dobrarprecodoproduto();
        System.out.println(p1.resumoProduto());
        p1.multiplicarproduto(8);
        System.out.println(p1.resumoProduto());

        int opcao = 5;
        switch (opcao){
            case 1 :
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2 ");
                break;
            case 3 :
                System.out.println("case 3 ");
                break;
            case 4 :
                System.out.println("case 4 ");
                break;
            case 5:
                System.out.println("case5");
                break;

            default:
                System.out.println("caso padrão");
                break;


        }

    }
}
