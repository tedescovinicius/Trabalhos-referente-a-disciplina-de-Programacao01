import java.util.Scanner;

public class QuartaQuestao {
    
    public static void main(String[]args){
        int vet[];
        vet = new int[11];

        vet[0] = 1;
        for (int i = 0; i < 11; i++){
            vet[i] = i;
            System.out.println( vet[i] +" X 6 = " + vet[i]*6 + "    " + vet[i] +" X 2 = " + vet[i]*2);
        }

    }
} 