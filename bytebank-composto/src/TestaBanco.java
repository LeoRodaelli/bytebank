import java.util.concurrent.Callable;

public class TestaBanco {
    public static void main(String[] args) {

        Cliente leo = new Cliente();
        leo.nome = "Leo Rodaelli";
        leo.cpf = "111.222.111-19";
        leo.profissao = "DBA";

        Conta contaLeo = new Conta();
        contaLeo.deposita(100);

        contaLeo.titular = leo;
        System.out.println(contaLeo.titular.nome);

                


    }
}
