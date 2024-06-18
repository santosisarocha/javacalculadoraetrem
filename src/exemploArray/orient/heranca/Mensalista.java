package exemploArray.orient.heranca;

public class Mensalista extends Colaborador{

    Double bancoDeHoras;
    Double salarioMensal;
    public Mensalista(int edv, String nome, String cargo, double salarioMensal) {
        super(edv, nome, cargo);
        this.salarioMensal=salarioMensal;
    }

    double receberSalario(){
        return salarioMensal;
    }
}
