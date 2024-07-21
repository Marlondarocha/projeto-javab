public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 1021;
        System.out.println(numero);

        String agencia = "067-8";
        System.out.println(agencia);

        String nomeCliente = "Mario Andrade";
        System.out.println(nomeCliente);

        double saldo = 237.48;
        System.out.println(saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
