package rh;
public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente(){
        super();
    }

    public Assistente(String nome, String endereco, String cpf, Double salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nhoraExtra=" + horaExtra;
    }

    @Override
    public Double calculaSalario() {
        return this.salario + (30 * this.horaExtra);
    }
}
