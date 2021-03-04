class teste{
    public static void main (String args[]){
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();

        r1.base = 3;
        r1.altura = 5;

        r1.imprimeDimensoes();

        r1.multiplicaDimensoes(2);

        r1.imprimeDimensoes();

        r2.imprimeDimensoes();

        r1.clona(r2);

        r1.imprimeDimensoes();
    }
}