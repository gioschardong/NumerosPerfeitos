//Programa para identificar numeros perfeitos
import java.util.Scanner;

public class NumerosPerfeitos {
    public static void main(String[] args) {
        
        //Variaveis
        int valor;
        int divisor=1;
        int somaDivisores=0;
        
        //Recolher valor
        System.out.println("Verificar se o Número é perfeito ou não");

        Scanner in = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        valor = in.nextInt();

        //Descobrir se o numero é perfeito
        while (divisor < valor) {
            if ((valor % divisor) == 0) {
                somaDivisores= somaDivisores + divisor; 
            }

            divisor++;
        }

        //Apresentar resultado
        if (somaDivisores == valor)
        {
            System.out.println("o Número: " +valor+ " é Perfeito");
        }
        else{
            System.out.println("o Número: " +valor+ " não é Perfeito");
        }
    }
}