class Retangulo {
    int base;
    int altura;

    int calculaArea(){
        return base * altura;
    }

    void multiplicaDimensoes(int fator){
        base   = base *fator;
        altura = altura * fator;
    }

    /*void clona(int base, int altura){
        this.base =  base;
        this.altura = altura;
    }*/

    void clona(Retangulo r){
        base   = r.base;
        altura = r.altura;
    }

    void imprimeDimensoes(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}