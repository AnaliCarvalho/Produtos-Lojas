public class ProdutoSkinCare extends Produto {
     String dataValidade;

     public ProdutoSkinCare(String nome, double preco, int quantidade, String dataValidade) {
         super(nome, preco, quantidade);
         this.dataValidade = dataValidade;
     }
}
