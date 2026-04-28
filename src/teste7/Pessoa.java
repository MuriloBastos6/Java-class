package teste7;

public class Pessoa {
    public String nome;
    public int id;
    public dependente dependente;

    Pessoa() {
    }

    Pessoa(String nome, dependente dep, int id){
        this.id = id;
        this.nome = nome;
        this.dependente = dep;
    }

    public void transformarNomeMaisculo() {
        this.nome = this.nome.toUpperCase();
    }
    public String exibirIdNome() {
        return (this.id + " - " + this.nome);
    }
    public void MudarDeNome(String novoNome) {
        this.nome = novoNome;
    }
    public String exibirDependente() {
        return ("Nome:" + this.dependente.nome + " - " +  "Idade: " + this.dependente.idade );
    }
}