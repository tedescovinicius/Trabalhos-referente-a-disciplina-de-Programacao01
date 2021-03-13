class Quadrado {
    int lado;

    int calculaArea(){
        int r = lado * lado;
        return r;
    }
}

class Forma{
    void imprimeQuadrado(Quadrado d){
        System.out.println("lado = " + d.lado);
        System.out.println("area = " + d.calculaArea());
    }

    Quadrado multi(Quadrado a, Quadrado b){
        Quadrado q = new Quadrado();
        q.lado = a.lado * b.lado;
        return q;
    }
}

class Main{
    public static void main(String[] args){
        Quadrado c1 = new Quadrado(), c2 = new Quadrado(), c3;
        c1.lado = 2;
        c2.lado = 5;
        Forma f = new Forma();
        f.imprimeQuadrado(c1);
        f.imprimeQuadrado(c2);
        c3 = f.multi(c1, c2);
        f.imprimeQuadrado(c3);
    }
}