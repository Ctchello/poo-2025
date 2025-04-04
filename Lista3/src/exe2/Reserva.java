package exe3;

import java.util.Date;

public class Reserva {
    private int id;
    private Date date;
    private int validade;

    private Passageiro passageiro;
    private Voo voo;

    public Reserva(){

    }

    public Reserva(int id, Date date, int validade, Passageiro passageiro, Voo voo) {
        this.id = id;
        this.date = date;
        this.validade = validade;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", date=" + date +
                ", validade=" + validade +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
