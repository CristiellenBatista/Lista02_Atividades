package exercicio;


  /* Nome do Aluno: Cristiellen da Silva Batista
  * RA:722313053
  * Nome do programa: Exercicio1
  * Decrição:faça um programa que leia dois numeros "A e B" e inprima o maior deles
  * data: 12/04/2023 
  */

  import java.util.Scanner;

 public class exercicio1{
     
public static void  main(String[] args) {
    
  int numeroA;
  
  System.out.println("mim infprme numeroA: ");
  Scanner teclado = new Scanner(System.in);
  numeroA = teclado.nextInt(); 

  int numeroB;
  
 System.out.println("mim infprme numeroB: ");
  numeroB = teclado.nextInt();
 if(numeroA > numeroB){
        System.out.println(numeroA);
} else{
    System.out.println(numeroB);   
}

}
 }