import java.util.Scanner;
import java.io.IOException;

class Parser{

  static int analize(String vetor[]){
    int n=0;
    for (int i=0; i<6; i++){

      if (vetor[i].equals("token") || (vetor[i].charAt(0)== 'h')){
        n++;
      }
    }
    return n;
  }
}

class MainParser {
  public static void main(String[] args) {
    String vet[] = {"token" , "humor" , "token" , "token" , "hb20" , "linda"};    
    System.out.println("Retorno:" + Parser.analize(vet));
  }
}
