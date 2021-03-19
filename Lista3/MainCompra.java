import java.util.Scanner;

class Compra {
  String nomeProduto;
  float preco;
  int quantidade;

  public Compra (String produto, float preco, int quantidade){
    this.nomeProduto = produto;
    this.preco       = preco;
    this.quantidade  = quantidade;
  }

  public void imprimeResumo(){
    System.out.println("Produto...:" + this.nomeProduto);
    System.out.println("Preco.....:" + this.preco);
    System.out.println("Quantidade:" + this.quantidade);
  }
} 

class MainCompra { 

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  String S;
  float  P;
  int    Q;  

  System.out.println("Digite o produto:");
  S = scanner.nextLine();

  System.out.println("Digite o preço:");
  P = scanner.nextFloat();

  System.out.println("Digite a quantidade:");
  Q = scanner.nextInt();

  Compra c = new Compra(S,P,Q);
  c.imprimeResumo();

  }
} 