package Exercicio6;

import java.util.Scanner;

public class Exercicio6{
 
  /* Nome do Aluno: Cristiellen da Silva Batista
  * RA:722313053
  * Nome do programa: Exercicio6

  * crição:Faça um programa calcula o total de uma hospedagem em um
hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
De
R$ 5.50 por diária, se o número de diárias for 15maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.

  * data: 14/04/2023 
    */
    public static void  main(String[] args) {

int numDiarias;
System.out.println("mostre valor total das diarias: ");
Scanner teclado = new Scanner(System.in);
numDiarias= teclado.nextInt();

double taxaServico;
if (numDiarias > 15){
taxaServico = 5.50;
} else if (numDiarias == 15) {
 taxaServico = 6.00;
}else{
taxaServico = 8.00;
} 
//realizar calculo do valor total das hospedaguem
double valorDiaria = 60.00;
double valorTotal = valorDiaria + (numDiarias * taxaServico);                                                                    


System.out.printf("o valor total da hospedaguem é R$ %.2f", valorTotal);

teclado.close();
}


}
   



