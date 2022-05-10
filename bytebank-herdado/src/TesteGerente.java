public class TesteGerente {
    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();


        Gerente g1 = new Gerente();
        g1.setNome("Hami");
        g1.setCpf("111222111-19");
        g1.setSalario(5000.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(1111);
        boolean autenticou = g1.autentica(1111);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
