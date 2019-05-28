package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaJava {

    public static void main(String[] args) {
       
        //Sorteia o número
        Random sorteio = new Random();
        int numeroSorteado = sorteio.nextInt(11);
    
        Scanner leia = new Scanner(System.in);
        int aux = -1;
        
        /*
        Enquanto o usuário não acertar, fica solicitando um número
        */
        while (aux != numeroSorteado) { 
            
            //Solicita o número
            System.out.println
            ("Informe um número:");
            aux = leia.nextInt();
            
            //Verifica se o usuário acertou
            if (aux == numeroSorteado) {
                System.out.println
                ("Parabéns! Você acertou!");
            } else {
                System.out.println
                ("Você errou! Tente novamente.");
            }
        }
        
    }
    
}
