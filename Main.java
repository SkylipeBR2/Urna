import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] soma = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            System.out.printf("Digite os números do vetor A[%d]: \n", i);
            A[i] = input.nextInt();
        }

        for (int i = 0; i < tamanho; i++){
            System.out.printf("Digite os números do vetor B[%d]: \n", i);
            B[i] = input.nextInt();
        }

        for (int i = 0; i < soma.length; i++){
            soma[i] = A[i] + B[i];
            System.out.printf("A soma dos vetores A[%d] e B[%d] é: %d\n",i, i, soma[i]);
        }


            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

    }
}