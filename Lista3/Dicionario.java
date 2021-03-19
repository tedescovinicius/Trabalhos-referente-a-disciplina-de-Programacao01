
class Var {
  public int valor;
  public String nome;

  public Var(int valor, String nome){
    this.valor = valor;
    this.nome  = nome;
  }
  public int getValor(){
    return valor;
  }
  public String getNome(){
      return nome;
  }
}

class Dicionario {
  public static Var tabela[];

  public static Var getVariavelByName(String nome){
      for (int i = 0; i< Dicionario.tabela.length ; i++){
        if (Dicionario.tabela[i].getNome().equals(nome)){
          return Dicionario.tabela[i];
        }
        return null;
      }
  }

}
