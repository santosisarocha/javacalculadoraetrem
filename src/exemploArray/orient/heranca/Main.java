package exemploArray.orient.heranca;

public class Main {

    public static void main(String[] args) {
        Mensalista mensalista = new Mensalista(925555, "murilo", "UI/UX", 2000);
        Horista horista = new Horista(2555, "Isabela", "beck", 100, 2000);

        System.out.println("o salario é " + mensalista.receberSalario());
        System.out.println("o salario do horista é " + horista.receberSalario());

        String prioridade = "urgente";


        if (prioridade.equalsIgnoreCase("urgente")) {
            System.out.println("prioridade total, receber agora");
        } else if (prioridade.equalsIgnoreCase("alta")) {
            System.out.println("prioridade alta, resolver o mais rapido possivel");
        } else if (prioridade.equalsIgnoreCase("media")) {
            System.out.println("prioridade media, resolver antes do prazo");
        } else if (prioridade.equalsIgnoreCase("baixa")) {
            System.out.println("prioridade baixa");
        } else {
            System.out.println("prioridade nãp intentificado");
        }



    }
}
