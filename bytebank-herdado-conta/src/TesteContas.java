public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(1111, 1111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("ContaCorrente: " + cc.getsaldo());
        System.out.println("ContaPoupança: " + cp.getsaldo());

    }
}
