package Exercicio8;
import java.util.Scanner;
public class Exercicio8 {


    /* Nome do Aluno: Cristiellen da Silva Batista
* RA:722313053
* Nome do programa: Exercicio8

* Decrição: Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%

* data: 14/04/2023 
*/

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Informe o valor da venda: R$ ");
            double valorDaVenda = input.nextDouble();
    
            System.out.println("\nEscolha a condição de pagamento:\n");
            System.out.println("1. Venda à vista");
            System.out.println("2. Venda a prazo 30 dias");
            System.out.println("3. Venda a prazo 60 dias");
            System.out.println("4. Venda a prazo 90 dias");
            System.out.println("5. Venda com cartão de débito");
            System.out.println("6. Venda com cartão de crédito");
    
            System.out.print("\nOpção escolhida: ");
            int opcao = input.nextInt();
    
            double totalVenda = 0.0;
    
            if (opcao == 1) {
                totalVenda = valorDaVenda * 0.9;
            } else if (opcao == 2) {
                totalVenda = valorDaVenda * 0.95;
            } else if (opcao == 3) {
                totalVenda = valorDaVenda;
            } else if (opcao == 4) {
                totalVenda = valorDaVenda * 1.05;
            } else if (opcao == 5) {
                totalVenda = valorDaVenda * 0.92;
            } else if (opcao == 6) {
                totalVenda = valorDaVenda * 0.93;
            } else {
                System.out.println("Opção inválida.");
                System.exit(0);
            }
    
            System.out.printf("\nValor da venda: R$ %.2f\n", valorDaVenda);
            System.out.printf("Valor total com desconto/acréscimo: R$ %.2f\n", totalVenda);
        }
    }  

