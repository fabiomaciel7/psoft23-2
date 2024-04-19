package grasp;

import java.util.ArrayList;

public class Venda {

	private ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();

	
	public ArrayList<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}

	public double total() {
		double total = 0;
		
		for (ItemVenda item: itens) {
			total += item.getSubTotal();
		}
		return total;
	}
	
	public void adicionarItemVenda(int quantidade) {
		this.itens.add(new ItemVenda(quantidade));
	}
	
	public void realizarPagamento() {
		Pagamento p = new Pagamento();
	}
		
}