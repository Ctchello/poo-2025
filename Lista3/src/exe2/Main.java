package exe3;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        Passageiro p1 = new Passageiro(20, "João", "555.666.333-22");
        Voo v1 = new Voo(167, new Date(), "Brasil", "Venezuela");
        Reserva r1 = new Reserva(78892, new Date(), 20, p1, v1);
        System.out.println(r1);
    }

}
