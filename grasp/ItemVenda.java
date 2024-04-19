package grasp;

public class ItemVenda {
	
	private int quantidade;
	private Produto produto;
	
	public ItemVenda(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getSubTotal() {
		double subtotal = quantidade * produto.getPreco();
		double desconto = verDesconto(subtotal);
		return subtotal - desconto;
	}
	
	public double verDesconto(double subtotal) {
		double desconto = 0;
		if (quantidade >= 100) {
			desconto = subtotal * 0.1;
		}
		return desconto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}