import java.util.Scanner;

class  ProgAutor{
    public static void main (String args[]){
        Autor a = new Autor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Nome:");
        a.nome = scanner.nextLine();
        System.out.println("Digite o ID:");
        a.id = scanner.nextInt();

        a.carregaDoTeclado();

    }
}

