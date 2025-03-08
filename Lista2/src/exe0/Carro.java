package exe0;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(){
        this.marca = "Marca não definida";
        this.modelo = "Modelo não definido";
    }

    //////////////// getters ////////////////////
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public float getVelocidade() {
        return this.velocidade;
    }
    /////////////////////////////////////////

    //////////////// setters ////////////////
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        if (ano > 0){
            this.ano = ano;
        }
    }
    public void setVelocidade(float velocidade){
        if (velocidade > 0) {
            this.velocidade = velocidade;
        }
    }
    ////////////////////////////////////////////////

    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }
    public void acelerar(float x){
        this.setVelocidade(this.velocidade + x);
        this.verificaLimiteVelocidade();
    }
    public void frear(float x){
        this.setVelocidade(this.velocidade - x);
    }
    public String exibeDados(){
        return "Marca: " + this.marca +
                "Modelo: " + this.modelo +
                "Ano:" + this.ano +
                "Velocidade: " + this.velocidade;
    }

    private void verificaLimiteVelocidade(){
        if (this.velocidade > 200){
            this.velocidade = 200;
        }
    }
}
