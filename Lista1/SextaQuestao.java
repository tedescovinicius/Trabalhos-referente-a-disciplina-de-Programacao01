import java.time.LocalDate;
import java.util.Scanner;

class SextaQuestao {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int idade, anoNasc = 2000, anoAtual = LocalDate.now().getYear();

    /*(System.out.println("Digite sua idade de nascimento:");
    anoNasc = scanner.nextInt();*/
    idade = anoAtual - anoNasc;

    System.out.println("idade:" + idade);
  }
}