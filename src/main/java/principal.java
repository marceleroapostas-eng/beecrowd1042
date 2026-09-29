
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        int originalA = A;
        int originalB = B;
        int originalC = C;

        if (A > B) {
            int aux = A;
            A = B;
            B = aux;
        }

       if (A > C) {
            int aux = A;
            A = C;
            C = aux; 
       }
        
       if (B > C) {
            int aux = B;
            B = C;
            C = aux;
       }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();

        System.out.println(originalA);
        System.out.println(originalB);
        System.out.println(originalC);

    }
}
