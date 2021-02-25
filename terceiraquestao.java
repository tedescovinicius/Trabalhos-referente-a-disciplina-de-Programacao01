import java.util.Scanner;

public class terceiraquestao {
    
    public static void main(String[]args){
        int vet[];
        vet = new int[10];

        vet[0] = 1;
        for (int i = 0; i < vet.length-1; i++){
            System.out.println( vet[i]);
            System.out.println( vet[i] +" X 5 = " + vet[i]*5);
        }

    }
} 