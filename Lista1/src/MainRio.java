import exe4.Rio;

import javax.swing.*;

public class MainRio {
    public static void main(String[] args){
        Rio r1 = new Rio("Amazonas", 200.53f, false);
        r1.chover(200);
        r1.ensolarar(33);
        r1.sujar();
        r1.mostra();

        Rio r2 = new Rio();
        r2.nome = JOptionPane.showInputDialog("Digite o nome do rio");
        r2.nivel = Float.parseFloat(JOptionPane.showInputDialog("Informe o nível do rio"));
        r2.poluido = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite 'true' se o rio está poluído ou 'false' caso contrário"));
        r2.ensolarar(100);
        r2.mostra();
    }
}
