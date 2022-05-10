public class testaMetodo {
    public static void main(String[] args) {

        Conta contaDoLeo = new Conta();
        contaDoLeo.saldo = 790;

        contaDoLeo.deposita(2700);
        System.out.println(contaDoLeo.saldo);

        boolean conseguiuRetirar = contaDoLeo.saca(700);
        System.out.println(contaDoLeo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaMarlene = new Conta();
        contaMarlene.deposita(1000);

        boolean sucessoTransferencia = contaMarlene.transfere(300, contaDoLeo);

        if(sucessoTransferencia){
            System.out.println("Transferencia com sucesso!");
        }
        else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaMarlene.saldo);

        System.out.println(contaDoLeo.saldo);

        contaDoLeo.titular = "Leo Rodaelli";
        System.out.println(contaDoLeo.titular);

    }
}
