public class CriaConta {

    public static void main(String[] args) {
        new Conta();

        Conta contaJ = new Conta();
        contaJ.titular = "Rodaelli";
        contaJ.numero = 16;
        contaJ.agencia = 01;
        contaJ.saldo = 7900;

        Conta contaLeo = new Conta();
        contaLeo.titular = "Leo";
        contaLeo.numero = 2791927;
        contaLeo.agencia = 02;
        contaLeo.saldo = 1900;

        contaLeo.saldo += 800;
        System.out.println("Nome da conta: " + contaLeo.titular + "\nO saldo da conta é: " + contaLeo.saldo);

        System.out.println(contaLeo);
        System.out.println(contaJ);



    }
}
