public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(123, 456);
        conta.deposita(100);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getNumero());
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setNome("Marcela");
        System.out.println(conta.getTitular().getNome());
    }
}
