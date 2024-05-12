import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Insira seu nome:");
        contaTerminal.setNomeCliente(sc.nextLine());
        System.out.println("Insira a agência:");
        contaTerminal.setAgencia(sc.nextLine());
        System.out.println("Insira o número da conta:");
        contaTerminal.setNumero(sc.nextInt());
        System.out.println("Insira seu saldo:");
        contaTerminal.setSaldo(sc.nextFloat());

        contaTerminal.imprimir();
        
        sc.close();
    }

}
