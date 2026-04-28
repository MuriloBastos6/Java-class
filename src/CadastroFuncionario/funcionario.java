package CadastroFuncionario;

public class funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){this.salario = salario;}
        else{
            System.out.printf("Salário inválido! O salário deve ser maior que zero.\n");
        }
    }

    funcionario(int id, String nome, String cargo, double salario){
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
       double novoSalario = this.salario + (this.salario * percentual / 100.00);
       setSalario(novoSalario);
    }

    public void exibirFicha(){
        System.out.printf("=== Ficha do Funcionário ===\n");
        System.out.printf("ID: %d, Nome: %s, Cargo: %s, Salário: %.2f\n", this.id, this.nome, this.cargo, this.salario);
        System.out.printf("=============================\n");

    }

}
