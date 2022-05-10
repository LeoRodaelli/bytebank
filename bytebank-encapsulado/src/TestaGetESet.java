public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 19227);
        //conta.numero = 1337; (n funciona mais)
        conta.deposita(1337);


        System.out.println("Numero: " + conta.getNumero());

        conta.deposita(6000);
        System.out.println("Saldo atual: " + conta.getsaldo());

        Cliente leo = new Cliente();
        // conta.titular = leo;

        leo.setNome("Nome: Leo Rodaelli");

        conta.setTitular(leo);
        leo.setCpf("CPF: 111.222.777-99");
        leo.setProfissao("Profissão: dev");
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());


    }
}
