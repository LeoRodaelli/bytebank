import java.util.concurrent.Callable;

public class TestaContaSemCliente {
    public static void main(String[] args) {

        Conta contaMarlene = new Conta();
        System.out.println(contaMarlene.getsaldo());

        contaMarlene.titular = new Cliente();
        System.out.println(contaMarlene.titular);

        contaMarlene.titular.nome = "Marlene";
        System.out.println(contaMarlene.titular.nome);








    }
}
