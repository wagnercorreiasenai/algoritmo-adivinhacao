package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaJava {

    public static void main(String[] args) {
       
        //Sorteia o número
        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(101);
    
        Scanner leia = new Scanner(System.in);
        int aux = -1;
        int numeroTentativas = 0;
        
        /*
        Enquanto o usuário não acertar, fica solicitando um número
        */
        while (aux != numeroSorteado) { 
            
            //Solicita o número
            System.out.println
            ("Informe um número:");
            aux = leia.nextInt();
            numeroTentativas++;
            
            //Verifica se o usuário acertou
            if (aux == numeroSorteado) {
                System.out.println
                ("Parabéns! Você acertou!");
            } else {
                System.out.println
                ("Você errou! Tente novamente.");
                
                if (numeroSorteado > aux) {
                    System.out.println
                    ("O número sorteado é maior que "+aux);
                } else if (numeroSorteado < aux) {
                    System.out.println("O número sorteado é menor que "+aux);
                }
                
            }
        }
        
        System.out.println
        ("Número de tentativas: "+numeroTentativas);
        
    }
    
}
