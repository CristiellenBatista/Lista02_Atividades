package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    
 /* Nome do Aluno: Cristiellen da Silva Batista
  * RA:722313053
  * Nome do programa: Exercicio04

  * Decrição:Faça um programa que leia o nome, o sobrenome, a idade, em
    * anos, e a naturalidade (cidade de nascimento) de uma pessoa.
    * Depois, o programa deve dar a seguinte opção “Deseja
    * visualizar dados completos?”. Se o caractere digitado pelo
    * usuário for ‘S’ o programa deve imprimir na tela Nome,
    * Sobrenome, idade e naturalidade. Se o caractere digitado pelo
    * usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
    * o caractere não for nenhuma das outras opções acima o programa
    * deve imprimir “Digitação errada. Tente Novamente”.

data: 14/04/2023
*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Leitura das informações pessoais
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();
        input.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite a sua cidade de nascimento: ");
        String naturalidade = input.nextLine();

        // Escolha das informações a serem visualizadas
        System.out.print("Deseja visualizar dados completos? (S/N): ");
        String opcao = input.nextLine();

        if (opcao.equalsIgnoreCase("S")) {
            System.out.println("Nome completo: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao.equalsIgnoreCase("N")) {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        

                    input.close();
  
}
    }
}