package exe1;
public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente(){
        this.setNumeroAgencia("0000-0");
        this.setNumeroConta("000000-0");
        this.nome = "Indefinido";
    }

    /////////////// getters ////////////////
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo() {
        return this.saldo;
    }
    /////////////////////////////////////////

    /////////////// setters /////////////////
    public void setNumeroConta(String s){
        if(s.length() == 8){
            this.numeroConta = this.validacao(s, 6);
        }
        else{
            this.numeroConta = "000000-0";
        }
    }
    public void setNumeroAgencia(String s){
        if(s.length() == 6){
            this.numeroAgencia = this.validacao(s, 4);
        }
        else{
            this.numeroAgencia = "0000-0";
        }
    }
    public void setNome(String s){
        if(s.length() <= 30){
            this.nome = s;
        }
        else{
            this.nome = "Inválido";
        }
    }
    public void setSaldo(float f){
        if(f >= 0){
            this.saldo = f;
        }
    }
    ///////////////////////////////////////
    public void realizarDeposito(float f){
        if(f > 0){
            this.setSaldo(this.saldo + f);
        }
    }
    public void realizarSaque(float f){
        if(f > 0){
            this.setSaldo(this.saldo - f);
        }
    }
    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }
    public String exibirDados(){
        return "Número da conta: " + this.getNumeroConta() +
                "\nNúmero da agência " + this.getNumeroAgencia() +
                "\nNome: " + this.getNome() +
                "\nSaldo: R$" + this.getSaldo();
    }
    private String validacao(String s, int i){
        for(int j = 0; j < i; j++){
            if(!Character.isDigit(s.charAt(j))){
                if(i == 6){
                    return "000000-0";
                }
                else {
                    return "0000-0";
                }
            }
        }
        if(s.charAt(i) != '-' || !Character.isDigit(s.charAt(i+1))){
            if(i == 6){
                return "000000-0";
            }
            else {
                return "0000-0";
            }
        }
        return s;
    }
}
