public class Estado {
    private String _nome, _capital;
    private float _populacao, _territorio;

    public Estado(String _nome, String _capital, float _populacao, float _territorio){
        this._nome = _nome;
        this._capital = _capital;
        this._populacao = _populacao;
        this._territorio = _territorio;
    }
    public void exibirDetalhes(){
        System.out.println(
           "Estado: " + this._nome +
           "\nCapital: " + this._capital +
           "\nPopulação: " + this._populacao + " milhões de habitantes" +
           "\nTerritório: " + this._territorio + " mil km²"
        );
    }
}
