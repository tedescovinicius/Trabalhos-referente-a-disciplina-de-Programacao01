import java.util.Scanner;

class​ Autor {
    String nome;
    int​ id;

    void carregaDoTeclado(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Nome:");
        nome = scanner.nextLine();
        System.out.println("Digite o ID:");
        id = scanner.nextInt();
    }
}