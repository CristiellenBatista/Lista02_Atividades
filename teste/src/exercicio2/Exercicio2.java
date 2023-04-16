package exercicio2;

import java.util.Scanner;

public class Exercicio2{               
/* Nome do Aluno: Cristiellen da Silva Batista
* RA:722313053
* Nome do programa: Exercicio2
* Decrição:construa um programa que receba como entrada tres valores "A, B e C"e os oprima em ordem crescente.
* data: 12/04/2023 
*/

public static void  main(String[] args) {

int valorA;
System.out.println("informe valorA: ");
Scanner teclado = new Scanner(System.in);
 valorA = teclado.nextInt();

 int valorB;
System.out.println("informe valorB: ");
valorB = teclado.nextInt();

int valorC;

System.out.println("informe valorC: ");
valorC = teclado.nextInt();

teclado.close();


if (valorC > valorB && valorC > valorA && valorB > valorA){
    System.out.printf("%d %d %d",valorA,valorB,valorC);   
}else if (valorA > valorB && valorA > valorC && valorA > valorB){
System.out.printf("%d %d %d",valorA,valorB,valorC);
} else if (valorA > valorB && valorC > valorA && valorB > valorC){
System.out.printf("%d %d %d",valorA,valorB,valorC);
}else if (valorA > valorA && valorC > valorA && valorB > valorC){   
System.out.printf("%d %d %d",valorC,valorB,valorA);

}else if (valorA > valorB && valorC > valorA && valorB > valorA){
System.out.printf("%d %d %d", valorA,valorB,valorC);
}else if (valorA > valorB && valorC > valorC && valorB > valorC){
System.out.printf("%d %d %d", valorA,valorB,valorC);

}
}
}