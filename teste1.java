import java.util.Scanner;

public class teste1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inteiro;
        String nome = "Vini";
        float flutuante = 3.2f;
        float flutuante2 = (float) 3.2;

        float vetor[];
        vetor = new float[10];

        float vetor2[] = new float[30];

        inteiro = 10;
        boolean verdadeiro = (inteiro > 10);
        vetor[0] = 3.4f;
        vetor[1] = 3.2f;

        boolean ever = true;

        System.out.println("Vetor\n");
        // lenght da o tamanho do vetor
        for (int i = 0; i < vetor.length-1; i++){
            System.out.print("Vet["+i+"]:" + vetor[i]);
            if (i !=9){
                System.out.print(", ");
            }else{
                //nao printa nada
            }
        }
        System.out.println();

        if(verdadeiro){
            //verdadeiro
        }else{
            //se for falso
        }

        System.out.println("Inteiro: " + inteiro);
        System.out.println("Nome: " + nome);
        System.out.println("vetor[0]: " + vetor[0] + " , vetor[1]: " + vetor[1]);

        System.out.println("Digite seu nome:");
        //scanner.nextLine();
        nome = scanner.nextLine(); // fgets
        System.out.println("Seu Nome:" + nome);
    }
}