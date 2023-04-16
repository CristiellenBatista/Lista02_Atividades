 package Exeercicio5;    
 /* Nome do Aluno: Cristiellen da Silva Batista
  * RA:722313053
  * Nome do programa: Exercicio5

  * Decrição:Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito.

0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo

  * data: 13/04/2023 
  */

  import java.util.Scanner;

 public class Exercicio5{ 
     
public static void  main(String[] args) { 

int nota;
System.out.println("digite a nota do aluno a ser vereficada: ");
Scanner teclado = new Scanner(System.in);
nota = teclado.nextInt();

if (nota > 100 || nota < 0);
System.out.println("digitação incorreta, o valor da nota deve estar entre 0 e 100");
}else if (nota <= 49){
System.out.printf("a nota conceito do aluno %d é Insuficiente", nota);
}else if (nota <= 64){
System.out.printf("a nota conceito do aluno %d é regular", nota);
}else if (nota < 84){
System.out.printf("a nota conceito do aluno %d é bom", nota);
}else{
System.out.printf("a nota conceito do aluno %d é otima", nota);

}
 
}
 
