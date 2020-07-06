package TrabalhoPO;

public class ListNode {
    private Item elem;
	private ListNode prox;
	//Campo do nó
	
	public ListNode(Item elem) {
		//Constructor
		this.elem = elem;
		//Não é preciso apontar prox pra Null pois o mesmo já esta apontando pra tal
	}

	//get block
	public Item getElem() {
		return this.elem;
	}
	public ListNode getProx() {
		return this.prox;
	}
	
	//set block
	public void setElem(Item elem) {
		this.elem = elem;
	}
	public void setProx(ListNode prox) {
		this.prox = prox;
	}
}