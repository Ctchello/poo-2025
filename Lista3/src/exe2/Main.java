package exe2;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro(1, "Carlos", "123");

        Voo vo1 = new Voo(11, "Campinas",
                "Salvador", LocalDate.of(2025, 4, 25));

        Reserva re1 = new Reserva(111,LocalDate.of(2025, 4, 10) , 10, p1, vo1);
        // vamos definir a data da reserva
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate objData = LocalDate.parse("28/03/2025", formatter);
        re1.setData(objData);
        System.out.println(re1);
        JOptionPane.showMessageDialog(null, re1);

    }
}