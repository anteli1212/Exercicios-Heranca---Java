package atividadeheranca;

public class Estagiario extends Funcionario{
    private int horasTrabalhadas;
    
    public Estagiario(String nome, double salario, int horasTrabalhadas){
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public void ExibirInfos(){
        System.out.println("Nome do estagiario: " + nome);
        System.out.println("Salario do estagiario: R$" + salario);
        System.out.println("Horas Trabalhadas (por dia) do estagiario: " + horasTrabalhadas + "h");
    }
}
