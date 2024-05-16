import java.util.ArrayList;
import java.util.Scanner;
import Classes.Empregado;

public class Main {
    private static int idReserva = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empregado> empregados = new ArrayList<>();
        Empregado empregado = null;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu");
            System.out.println("\n1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Nome do funcionário:");
                    String nome = scanner.nextLine();

                    System.out.println("Informe sua idade: ");
                    int idade = scanner.nextInt();

                    System.out.println("Informe o salário: ");
                    double salario = scanner.nextDouble();

                    empregado = new Empregado(nome, idade, salario, idReserva);
                    empregados.add(empregado);
                    System.out.println("Empregado adicionado com sucesso!");

                    break;
                case 2:
                if(empregado != null){
                    empregado.promover(); 
                }
                    break;

                    case 3:
                    empregado.aumentarSalario(0.25);
                    break;

                    case 4:
                    empregado.demitir();
                    break;

                    case 5:
                    empregado.fazerAniversario();
                    break;

                    case 6:
                    if (empregados.isEmpty()) {
                        System.out.println("Não há empregados cadastrados.");
                    } else {
                        System.out.println("Detalhes dos empregados:");
                        for (Empregado e : empregados) {
                            System.out.println("Id funcionário: " + e.getIdReserva());
                            System.out.println("Nome: " + e.getNome());
                            System.out.println("Idade: " + e.getIdade());
                            System.out.println("Salário: " + e.getSalario());
                            System.out.println("----------------------------------");
                        }
                    }
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Programa finalizado...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}