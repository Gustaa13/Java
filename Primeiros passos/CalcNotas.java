import java.util.Scanner;

public class CalcNotas {
    public static void main(String[] args){

        int qt_notas = 4;
        float nota_final = 0;
        float[] notas = new float[qt_notas];
        
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < qt_notas; i++){
            System.out.println("Informe sua " + (i+1) + "º nota: ");
            notas[i] = scan.nextFloat();
        }
        
        for(float nota : notas){
            nota_final = nota + nota_final;
        }
        
        nota_final = nota_final / qt_notas;

        if(nota_final >= 7){
            System.out.println("Aprovado com média: " + nota_final);
        }else if(nota_final >= 3){
            System.out.println("Em recuperação com média: " + nota_final);
        }else{
            System.out.println("Reprovado com média: " + nota_final);
        }

        scan.close();
    }
}
