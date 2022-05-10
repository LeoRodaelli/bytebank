//Gerente é um funcionario ou Gerente herda da classe Funcionario
public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificação do Designer");
        return 200;
    }
}
