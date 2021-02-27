
class DecimaQuestao {

  public static void main(String[] args) {
    int p;
    int vet[] = new int[1000];

    for (int i=100; i < 200; i++ ){
        p=i;
        vet[p] = i;
        /*System.out.println(i);*/
        for (double x=i; x >= 0; x-=2){
          if (x == 0 ){
            System.out.println(vet[p]+1);  
          }            
        }
    }
  }
}