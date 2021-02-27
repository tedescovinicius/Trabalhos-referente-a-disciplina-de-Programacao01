class Fatorial {
    public int calcula(int n) {
        if (n == 0)
            return 1;
        else
            return n * calcula(n-1);   
    }
}

class FatorialMain {
    public static void main (String[] args) {
        int resultado;
        Fatorial fat = new Fatorial();
        resultado = fat.calcula(5);
        System.out.println("0 fatorial de 5 é: " + resultado);
        resultado = fat.calcula(6);
        System.out.println("O fatorial de 6 é: " + resultado);
    }  
}
