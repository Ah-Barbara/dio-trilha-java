import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO:Conhecer e importar a classe Scanner

       //Exibir as mensagens para o nosso uruário

       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem conta criada


       //Declaração de Variaveis
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        //Instaciamento de um objeto da classe Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o seu Saldo!");
        saldo = sc.nextFloat();
        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo é " + saldo + " já está disponivel para saque." );

    }
}

