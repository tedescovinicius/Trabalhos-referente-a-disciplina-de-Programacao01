import java.util.Scanner;

public class QuintaQuestao{
  public static void main(String[] args) {
    int veses = 1, quantidade = 1;
    
    while(quantidade <= 100){
      if(quantidade == 1){
          System.out.println(quantidade + " elefante incomoda muita gente!");
      }else{
        String incomodar = "";
            
        for(int i = 0; i < veses; i++){
          incomodar += "incomodam ";
        }
        System.out.println(quantidade + " elefantes " + incomodar + "muita gente!");
        }
        quantidade++;
        veses++;
      }
    }  
}
