import entities.Produto;

public class ProdutosApplication {
    //variável declarada como constrante devem ter letras maiúsculas e acresentar prefixo final

    public static final double DESCONTO = 0.10;

    public static void main(String[] args) {
        String nome = " ";

        Produto p = new Produto():

        nome = "Cristiano";

        System.out.println("Nome: " + nome);
        System.out.println("Preco " + p.preco);
        System.out.println("Quantidade:  " + Produto.quantidade);
    }

    public static double desconto(double preco){
        return preco - (preco * DESCONTO);
    }

}
