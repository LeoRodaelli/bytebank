import javax.swing.plaf.synth.SynthOptionPaneUI;

//Gerente é um funcionario ou Gerente herda da classe Funcionario
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificação do Editor de video");
        return 150;
    }
}
