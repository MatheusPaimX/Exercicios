import java.util.Scanner;

import model.Funcionario;

public class App {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner (System.in);
        Funcionario funcionario;
        
        System.out.println("Digite o número de funcionários: ");
        int numero = leia.nextInt();
        leia.nextLine();

        for (int i = 0; i < numero; i++) {
            
        System.out.println("Digite o nome do funcionário: ");
        String nome = leia.nextLine();

        System.out.println("Digite a matricula do funcionário: ");
        int matricula = leia.nextInt();
        
        System.out.println("Digite o salário do funcionário: ");
        Double salario = leia.nextDouble();
        leia.nextLine();

        funcionario = new Funcionario(nome, matricula ,salario);

       
        } 

        funcionario.finalizacao();

        

        leia.close();
    }
}