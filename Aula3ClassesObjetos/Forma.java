class​ Forma​ {
    void​ ​ imprimeQuadrado​(Quadrado d) {
        System.out.println(​ "lado = "​ + d.lado);
        System.out.println(​ "area = "​ + d.calculaArea());
    }
    Quadrado ​multi​(Quadrado a, Quadrado b) {
        Quadrado q = ​new​ Quadrado();
        q.lado = a.lado * b.lado;
        return​ q;
    }
}