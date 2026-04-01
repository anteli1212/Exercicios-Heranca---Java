package atividadeheranca;

import java.util.Scanner;

public class AtividadeHeranca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bem Vindo!");
        
        int escolha = 1;
        boolean continuar = true;
        
        do{
            do{
                System.out.println("Escolha o exercicio (1 - 4)");
                escolha = entrada.nextInt();
            }while(escolha > 4 || escolha < 1);
            
            switch(escolha){
                case 1:
                    Atividade01();
                    break;
                case 2:
                    Atividade02();
                    break;
                case 3:
                    Atividade03();
                    break;
                case 4:
                    Atividade04();
                    break;
            }
            
            System.out.println("\nDeseja continuar? (0 = nao, 1 = sim)");
            
            if(entrada.nextInt() == 0){
                continuar = false;
            }
        }while(continuar);
        
    }
    
    public static void Atividade01(){
        Funcionario funcionario = new Funcionario("Dwight Schrute", 2500);
        Gerente gerente = new Gerente("Michael Scott", 5000, 1000);
        Estagiario estagiario = new Estagiario("Ryan Howard", 1800, 6);
        
        System.out.println("\nInformacoes dos nossos trabalhadores:");
        System.out.println("\nFuncionario");
        funcionario.ExibirInfos();
        System.out.println("\nGerente");
        gerente.ExibirInfos();
        System.out.println("\nEstagiario");
        estagiario.ExibirInfos();
    }
    
    public static void Atividade02(){
        Transporte transporte = new Transporte();
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();
        Aviao aviao = new Aviao();
        
        System.out.println("\nInformacoes de transportes:");
        System.out.println("\nTransporte");
        transporte.Mover();
        System.out.println("\nCarro");
        carro.Mover();
        System.out.println("\nBicicleta");
        bicicleta.Mover();
        System.out.println("\nAviao");
        aviao.Mover();
    }
    
    public static void Atividade03(){
        Calculadora calc = new Calculadora();
        
        System.out.println("\nSistema Calculadora:");
        System.out.println("\nSoma de 2 numeros inteiros");
        System.out.println("10 + 5 = " + calc.Somar(10, 5));
        System.out.println("\nSoma de 2 numeros decimais");
        System.out.println("5.2 + 2.8 = " + calc.Somar(5.2, 2.8));
        System.out.println("\nSoma de 3 numeros inteiros");
        System.out.println("12 + 21 + 6 = " + calc.Somar(12, 21, 6));
        System.out.println("\nMultiplicacao de 2 numeros inteiros");
        System.out.println("8 * 5 = " + calc.Multiplicar(8, 5));
        System.out.println("\nMultiplicacao de 2 numeros decimais");
        System.out.println("0.5 * 30.4 = " + calc.Multiplicar(0.5, 30.4));
    }
    
    public static void Atividade04(){
        Animal[] animais = {new Cachorro(), new Gato(), new Vaca()};
        
        for (int i = 0; i < animais.length; i++) {
            animais[i].FazerSom();
        }
    }
    
}
