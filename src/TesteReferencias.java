public class TesteReferencias {
    public static void main(String[] args) {
        Conta contaLeo = new Conta();
        contaLeo.saldo = 2000;

        System.out.println("Saldo da conta: " + contaLeo.saldo);

        Conta contaGi = contaLeo;

        System.out.println(contaGi.saldo);

        System.out.println(contaLeo);
        System.out.println(contaGi);
    }
}
