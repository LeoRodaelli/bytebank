public class TestaValoresConsistentes {

    public static void main(String[] args) {

        Conta conta = new Conta(1337, 19227);

        // conta esta inconsistente em relacao a regra de negocio
        //conta.setAgencia(-50);
        //conta.setNumero(-270);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 11119);

        System.out.println(Conta.getTotal());



    }
}
