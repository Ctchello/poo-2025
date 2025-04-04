package exe2;

import java.time.LocalDate;

public class Voo {
    private int id;
    private String origem, destino;
    private LocalDate data;

    public Voo() {
    }
    public Voo(int id, String origem, String destino, LocalDate data) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data +
                '}';
    }
}