package exemploArray.orient;

public class Colaborador {
    int edv;

    String nome;

    String cargo;


    Colaborador(){

    }
    Colaborador(String nome){
        this.nome = nome;
    }


    public Colaborador(int edv, String nome) {
        this.edv = edv;
        this.nome = nome;
    }

    public Colaborador(int edv, String nome, String cargo) {
        this.edv = edv;
        this.nome = nome;
        this.cargo = cargo;
    }
    public String toString(){
        return String.format("O colaborador %s tem o edv %d com o cargo de %s", this.nome, this.edv, this.cargo);
    }


}
