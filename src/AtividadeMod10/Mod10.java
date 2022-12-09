
package AtividadeMod10;

import java.util.Scanner;

/**
 * @author Gisela
 */
public class Mod10 {

    public static void primeiraParte() {

        int num1 = 10;
        int num2 = 10;
        int num3 = 4;
        int num4 = 4;

        int num5 = (20 + 8) / 4;
        System.out.println(num5);

    }

        public static void main(String args[]) {
           Scanner s = new Scanner(System.in);

           System.out.print("Digite a nota do aluno");


           int result = s.nextInt();

            if (result <= 4) {
                System.out.println("Reprovado");
            } else if (result == 5) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Aprovado");
            }
        }


    }




