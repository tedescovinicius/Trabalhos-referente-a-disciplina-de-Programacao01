
class NonaQuestao {

  public static void main(String[] args) {
    int n = 15, p;
    int vet[] = new int[48];

    for (int i=0; i < vet.length; i++ ){
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
