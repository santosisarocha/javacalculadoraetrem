package exemploArray;

public class atv_tabuada {
    public atv_tabuada() {
    }

    public static void main(String[] args) {
        int num = 0;
        int num1 = 0;
        int cont;
        int j = 0;


        for (int i = 0; i < 110; i++) {
            cont = num * num1;
            System.out.print("\t" +  num + "*" + num1 + "=" + cont + "\t");
            num1 = num1 + 1 ;
            j += 1;

            if (j == 10){
                num = num + 1;
                num1 = 0;
                j = 0;

                System.out.print("\n" );
            }

        }

    }
}
