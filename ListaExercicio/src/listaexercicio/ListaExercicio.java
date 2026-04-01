package listaexercicio;

import java.util.Scanner;

public class ListaExercicio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean repetir = true;
        int exercicio = 1;
        
        System.out.print("Seja bem vindo!\n");
        
        do{
            System.out.print("Escolha um exercicio (1 - 4): ");
            exercicio = entrada.nextInt();
            
            if(exercicio == 1)
            {
                float num1, num2;

                System.out.println("Informe dois numeros: ");
                num1 = entrada.nextFloat();
                num2 = entrada.nextFloat();

                float soma = num1 + num2;

                System.out.println("Soma = " + soma);
                
            }
            else if(exercicio == 2)
            {
                int idade;
                String status = "maior";
                System.out.println("Informe a sua idade: ");
                
                idade = entrada.nextInt();
                if(idade < 18){
                    status = "menor";
                }
                
                System.out.println("Voce e " + status + " de idade");
            }
            else if(exercicio == 3)
            {
                for(int i = 0; i <= 10; i++){
                    System.out.println(i);
                }
            }
            else if(exercicio == 4)
            {
                int senha;
                int senhaCorreta = 1234;
                
                do{
                    System.out.println("Informe a senha: ");
                    senha = entrada.nextInt();
                    
                    if(senha != senhaCorreta){
                        System.out.println("senha incorreta!");
                    }
                }while(senha != senhaCorreta);
                
                System.out.println("senha correta");
            }
            
            int resp;
            
            System.out.print("\nRepetir? (1=sim, 0=nao): ");
            resp = entrada.nextInt();
            if(resp == 0){
                repetir = false;
                return;
            }
        } while(repetir);
    }
}
