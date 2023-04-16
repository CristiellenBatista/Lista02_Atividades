package exercicio3;

    
import java.util.Scanner;

public class Exercicio3{               
/* Nome do Aluno: Cristiellen da Silva Batista
* RA:722313053
* Nome do programa: Exercicio3
* Decrição:Faça um programa que leia um número inteiro e mostre uma
* mensagem indicando se este número é par ou ímpar e se é
* positivo ou negativo.

* data: 13/04/2023 
*/

public static void  main(String[] args) {

int  numero;

System.out.println("informe numero: ");
Scanner teclado = new Scanner(System.in);
numero = teclado.nextInt();

boolean par;
par = (numero % 2 == 0);
        boolean impar;
        impar = (numero % 2 == 1);
        teclado.close();
        if (par && numero > 0) {
            System.out.println("O número é par e positivo");
        } else if (impar && numero > 0) {
            System.out.println("O número e ímpar e positivo");
        } else if (par && numero < 0) {
            System.out.println("O número é par e negativo");
        } else {
            if (impar && numero < 0) {
                System.out.println("O número informado é impar e negativo");

            }

}
}
}