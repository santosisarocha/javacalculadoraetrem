package exemploArray.orient.heranca;

public class Horista extends Colaborador{
    int horasTrabalhadas;
    double salarioPorHora;

    Horista(int edv, String nome, String cargo, int horasTrabalhadas, double salarioPorHora) {
        super(edv, nome, cargo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    double receberSalario(){
        return this.salarioPorHora*this.horasTrabalhadas;
    }
}
