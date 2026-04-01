package atividadeheranca;

public class Funcionario {
    String nome;
    double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
    
    public void ExibirInfos(){
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Salario do funcionario: R$" + salario);
    }
}
