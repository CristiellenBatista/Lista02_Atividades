package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

/* Nome do Aluno: Cristiellen da Silva Batista
* RA:722313053
* Nome do programa: Exercicio2

* Decrição: crie um programa que lê um numero entre 1 e 12, correspodendo a um dos messes do ano  onde o mês  1 é janeiro e o mês 12 é dezembro.
ao final, o programa deverá imprimir uma mensaguem indentificando,com base no numero digitado, o nome do mês e a estação.

* data: 12/04/2023 
*/

public static void  main(String[] args) {
 
Scanner teclado = new Scanner(System.in);
System.out.println("digite o numero do mes entre 1 e 12: ");
int mes; 
mes= teclado.nextInt();

if (mes == 1 || mes == 2 || mes == 12){
System.out.print("o mes é dezembro e as estção é inverno");
}else if ( mes >= 3 && mes <=5 ){
System.out.println("o mes é março e a estação é outono");
}else if (mes >= 6&& mes <=8){
System.out.println("o mes é junho e a estação é inverno");
}else if (mes >= 9 && mes <= 11 ){
System.out.println("o mes é setembro e a estacação é primavera");
}else if ( mes >=12)
System.out.println(" o mes é dezembro e a estação é primavera");



teclado.close();
}
}
