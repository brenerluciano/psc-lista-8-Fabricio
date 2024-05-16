package Classes;

import java.util.Scanner;

public class Empregado {
    private static int proximoId = 1;
    private int idReserva;
    private String nome;
    private int idade;
    private double salario;
    Scanner scanner = new Scanner(System.in);

    public Empregado(String nome, int idade, double salario, int idReserva) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.idReserva = proximoId++;
    }
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = proximoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (idade > 18) {
            aumentarSalario(0.25);
        } else {
            System.out.println("Infelizmente você não recebeu nenhuma promoção.");
        }
    }

    public void aumentarSalario(double percentual) {
        double aumento = salario * percentual;
        salario += aumento;
        System.out.printf("Parabéns, você acaba de receber uma promoção! Seu novo salário é: R$ %.2f\n", salario);
    }

    public void demitir() {
        System.out.println("Escolha uma opção:");
        System.out.println("1: Justa causa.");
        System.out.println("2: Decisão do empregado.");
        System.out.println("3: Aposentadoria.");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                    double multa = salario * 0.40;
                    System.out.printf("A multa de 40%% será de: R$ %.2f\n", multa);
                
                break;
            case 2:
                System.out.println("Você deverá cumprir o aviso prévio.");
                break;
            case 3:
            double salarioAposentadoria;
                if (salario >= 1000 && salario <= 1999) {
                    salarioAposentadoria = 1500;
                    System.out.println(salarioAposentadoria);
                    break;
                } else if (salario >= 2000 && salario <= 2999) {
                    salarioAposentadoria = 2500;
                    System.out.println(salarioAposentadoria);
                    break;
                } else if (salario >= 3000 && salario <= 4000) {
                    salarioAposentadoria = 3500;
                    System.out.println(salarioAposentadoria);
                    break;
                } else {
                    salarioAposentadoria = 4000;
                    System.out.println(salarioAposentadoria);
                    break;
                }
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário. ");
    }
    @Override
    public String toString(){
        return "\nId = " + idReserva;
    }
}