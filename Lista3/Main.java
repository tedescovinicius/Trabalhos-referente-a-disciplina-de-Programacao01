import java.util.Scanner;
import java.io.IOException;

class Parser{

  static void analize(String vetor){
    /*System.out.println("Imprime:" + vetor);*/
    Strig vetor[];
  }

}

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Parser p = new Parser();

    String vet[] = {"token" , "humor" , "token" , "token" , "hb20" , "linda"};    
    int n = 0;
    int v = 0;
    for (int i=0; i<6; i++){

      p.analize(vet[i]);
       
      /*System.out.println("Imprime:" + vet[i]);

      if (vet[i] == "token" || (vet[i].charAt(0)== 'h')){
        n++;
      }*/
    }
    System.out.println("Total:" + n );

  }
}