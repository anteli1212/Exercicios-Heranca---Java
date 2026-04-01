package atividadeheranca;

public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        this.bonus = bonus;
    }
    
    @Override
    public void ExibirInfos(){
        System.out.println("Nome do gerente: " + nome);
        System.out.println("Salario do gerente: R$" + salario);
        System.out.println("Bonus do gerente: R$" + bonus);
    }
    
}
