import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        Float saldo;
        List<Banco> contas = new ArrayList<>();

        System.out.println("Quantas contas você quer cadastrar?");
        int quantidade = input.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o numero da conta:");
            numero= input.nextInt();

            System.out.println("Digite o código da agencia:");
            agencia = input.next();
            input.nextLine();

            System.out.println("Digite o nome do cliente:");
            nomeCliente = input.nextLine();

            System.out.println("Digite o saldo da conta:");
            saldo = input.nextFloat();
            Banco conta = new Banco(numero,agencia,nomeCliente,saldo);
            contas.add(conta);
            System.out.println("Conta cadastrada com sucesso!");
            System.out.println("Olá, "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque.");


        }





    }
}