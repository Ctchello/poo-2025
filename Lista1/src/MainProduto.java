import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Refrigerante", 100, 7.5f);
        p1.comprar(100);
        p1.subir(1);
        p1.mostra();
    }
}
