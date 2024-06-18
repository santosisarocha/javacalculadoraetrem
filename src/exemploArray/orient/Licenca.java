package exemploArray.orient;

public class Licenca {
    String software;
    String departamento;
    static  int lincencasAtribuidas;

    Licenca(String software, String departamento) {
        this.software = software;
        this.departamento = departamento;
        lincencasAtribuidas ++;
    }

    static int retornaLicencaAtribuidas(){
        return lincencasAtribuidas;
    }
}
