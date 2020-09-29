public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(123, 456);
        System.out.println(conta.getNumero() + " " + conta.getAgencia());
        Conta conta2 = new Conta(123, 456);
        Conta conta3 = new Conta(123, 456);
        Conta conta4 = new Conta(123, 456);
        System.out.println(Conta.getTotal());

    }
}
