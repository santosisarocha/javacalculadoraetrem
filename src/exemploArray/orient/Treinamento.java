package exemploArray.orient;



public class Treinamento {

    String nome;

    double preco;

    boolean exclusivoParaGestores;

    Instrutor instrutor;

    public Treinamento(String nome, double preco, boolean exclusivoParaGestores, Instrutor instrutor) {
        this.nome = nome;
        this.preco = preco;
        this.exclusivoParaGestores = exclusivoParaGestores;
        this.instrutor = instrutor;
    }


    @Override
    public String toString() {
        return String.format("O treinamento %s está com um preço de %.2f e " +
                "exclusivo para gestores = %s e ministrado pelo treinador %s", this.nome, this.preco, this.exclusivoParaGestores ? "Sim":"Não", this.instrutor);
    }

    public Treinamento() {
        this.nome = "Java";
        this.preco = 10;
        this.exclusivoParaGestores = true;
    }

    int retornaQuantidadeDeMatriculas(){
        int matriculas = 0;
        return matriculas;
    }
}

