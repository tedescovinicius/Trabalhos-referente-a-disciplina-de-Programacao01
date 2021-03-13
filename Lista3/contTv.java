import java.util.Scanner;

class Televisao {
  ControleRemoto Controle = new ControleRemoto();
  int canal, volume;
  int x;
  Scanner scanner = new Scanner(System.in);

  void controlaMenu(int op){
    if(op == 1){
      System.out.println("Digite o canal:");
      this.canal = scanner.nextInt();
      Controle.CanalIndicado(this.canal);
    }
    if(op == 2){
      System.out.println("Digite o volume:");
      this.volume = scanner.nextInt();
      Controle.VolumeIndicado(this.volume);
    }
    if(op == 3){
      System.out.println("1 - Aumentar/ 2 - Diminuir:");
      this.x = scanner.nextInt();
      Controle.Volume(this.x);
    }
    if(op == 4){
      System.out.println("1 - Passar/ 2 - Voltar:");
      this.x = scanner.nextInt();
      Controle.Canal(this.x);
    }
    if(op == 5){
      Controle.imprime();
    }
  }

}

class ControleRemoto{
  int canalIndicado;
  int volumeIndicado;

  public void VolumeIndicado(int volume){
    this.volumeIndicado = volume;
  }

  public void Volume(int logi){
    if(logi == 1){
      this.volumeIndicado++;
    }else{
      this.volumeIndicado--;
    }
  }

  public void CanalIndicado(int canal){
    this.canalIndicado = canal;
  }

  public void Canal(int logi){
    if(logi == 1){
      this.canalIndicado++;
    }else{
      this.canalIndicado--;
    }
  }

  public void imprime(){
    System.out.println("Canal:"  + this.canalIndicado  );
    System.out.println("Volume:" + this.volumeIndicado + "\n");
  }

}

class contTv {
  public static void main(String[] args) {

  Televisao select = new Televisao();  

  Scanner menu = new Scanner (System.in);

    while (true) { 

      System.out.print("");
      System.out.print("##--CONTROLE--##\n");
      System.out.print("|---------------------------------------|\n");
      System.out.print("| Opção 1 - Definir Canal               |\n");
      System.out.print("| Opção 2 - Definir Volume              |\n");
      System.out.print("| Opção 3 - Aumentar/Diminuir Volume    |\n");
      System.out.print("| Opção 4 - Passar/Voltar de canal      |\n");
      System.out.print("| Opção 5 - Ver Dados                   |\n");
      System.out.print("| Opção 6 - Sair                        |\n");
      System.out.print("|---------------------------------------|\n");
      System.out.print("Digite uma opção: ");

      int opcao = menu.nextInt();

      if (opcao == 6) {
          System.out.print("\nAté logo!");
          menu.close(); 
      }

      switch (opcao) {
        case 1:
            select.controlaMenu(1);
            break;

        case 2:
            select.controlaMenu(2);
            break;

        case 3:
            select.controlaMenu(3);
            break;
        case 4:
            select.controlaMenu(4);
            break;
        case 7:
            select.controlaMenu(7);
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;
        }
    }
  }
}