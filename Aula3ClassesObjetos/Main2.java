class Quadrado {
    int lado;
    int x;
    int y;

    void imprime (){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

/* class Main2{
    public static void main(String[]args){
        Quadrado q1, q2;
        int i = 3, a = 4;
        q1 = new Quadrado();
        q1.x = 8;
        q1.y = 5;
        q2 = q1 ;
        a = i;
        q1.lado = 10;
        q2.x = 2;
        q2.y = 3;
        q2.imprime();
        q1.imprime();
    }
}*/

class Main2{
    public static void main(String[] args){
        Quadrado q1, q2, q3;
        q1 = new Quadrado();
        q1.x = 4;
        q1.y = 7;
        q2 = q1;
        q3 = q2;
        q1.imprime();
        q2.imprime();
        q1.lado = 10;
        q3.x = 2;
        q3.y = 3;
        q3.imprime();
    }
}