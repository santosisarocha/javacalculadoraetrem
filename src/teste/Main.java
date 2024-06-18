package teste;

public class Main {
    public static void main(String[] args) {

        Prioridade prioridade = Prioridade.valueOf("URGENTE");
        switch (prioridade){
            case URGENTE -> System.out.println("Prioridade total: Resolver agora!");
            case ALTA -> System.out.println("Prioridade alta: Resolver o mais cedo possível!");
            case MEDIA -> System.out.println("Prioridade média: Resolver dentro do prazo!");
            case BAIXA -> System.out.println("Prioridade baixa: Resolver quando houver disponibilidade!");
            default -> System.out.println("Prioridade não encontrada!");
        }
    }
}
