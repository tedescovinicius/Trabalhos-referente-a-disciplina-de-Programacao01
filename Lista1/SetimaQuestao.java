class SetimaQuestao {
  public static void main(String[] args) {
    int qtdPrimos = 0;
        int n = 1;

        while (qtdPrimos < 15) {
            if (ehPrimo(n)) {
                System.out.println(n);
                qtdPrimos++;
            }
            n++;
        }
    }

    public static boolean ehPrimo(int n) { 
        if (n < 2) 
            return false; 
  
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
    
}