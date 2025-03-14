import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int opcao;
        double peso;
        double conversao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de conversão de peso");
        System.out.println("1: Converte de libras para quilos");
        System.out.println("2: Converte de quilos para libras");

        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        if(opcao == 1){
            System.out.print("Digite o peso em libras: ");
            peso = scanner.nextDouble();
            conversao = peso / 2.205;
            System.out.printf("O novo peso em quilos: %.2f Kg", conversao);
        } else if(opcao == 2){
            System.out.print("Digite o peso em quilos: ");
            peso = scanner.nextDouble();
            conversao = peso * 2.205;
            System.out.printf("O novo peso em libras: %.2f Lbs", conversao);
        } else {
            System.out.print("Opção não é valida.");
        }

        scanner.close();
    }
}
