public class Agenda{
    private List<Pessoa> listaPessoas;
    private final Integer MAX;
    private Intger quantidadePessoas;

    public Agenda(){
        this.listaPessoas = new ArrayLis<Pessoa>();
        this.MAX = 10;
        this.quantidadePessoas = 0;
    }

    public void armazenaPessoa(String nome, Data dataNascimento, Double peso, Double altura){
        if (this.quantidadePessoas < this.MAX){
            this.listaPessoas.add(new Pessoa(nome, dataNascimento, peso, altura));
            this.quantidadePessoas++;
        } else {
            System.out.println(">> Agenda lotada ! <<!");
        }
    }
    
    public void removePessoa(String nome) {
        boolean removed = false;
        Iterator<Pessoa> it = this.listaPessoas.iterator();
        while (it.hasNext()) {
            if (it.next().getNome().equals(nome)) {
                it.remove();
                removed = true;
                this.quantidadePessoas--;
                break;
            }
        }
        if (removed){
            System.out.println("Pessoa removida!");
        } else {
            System.out.println("Pessoa encontrada!");
        }
    }

    public int buscaPessoa(String nome){
        for (Pessoa p : this.listaPessoas){
            if (p.getNome().equals(nome)){
                return this.listaPessoas.indexOf(p);
            }
        }
        return -1;
    }

    public void imprimeAgenda() {
        for (Pessoa p : this.listaPessoas){
            System.out.println(p);
        }
    }

    public void imprimePessoa (int index) {
        if (index < 0 || index >= this.quantidadePessoas){
            System.out.println("Index invalido");
        } else {
            System.out.println(this.listaPessoas.get(index));
        }
    }
}