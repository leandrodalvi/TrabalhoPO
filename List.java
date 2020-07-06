package TrabalhoPO;

public class List {
    private ListNode prim;
	private ListNode ult;
	private int quantidade_de_nos;

	public List(){
		this.prim = this.ult = null;
		this.quantidade_de_nos = 0;
	}

	public ListNode getPrim(){
		return prim;
	}

	public ListNode getUlt(){
		return ult;
	}

	
	//bloco de codigo de inserção
	public void insere_primeiro(Item inserido) {
		ListNode novo = new ListNode(inserido);
		this.quantidade_de_nos++;
		if(this.prim == null && this.ult == null) {
			this.prim = this.ult = novo;
		}else {
			novo.setProx(this.prim);
			this.prim = novo;
		}
		
	}
	public void insere_final(Item inserido) {
		ListNode novo = new ListNode(inserido);
		novo.setProx(null);
		this.quantidade_de_nos++;
		if(this.prim == null && this.ult == null) {
			this.prim = this.ult = novo;
		}else {
			this.ult.setProx(novo);
			this.ult = novo;
		}
    }
    
    public int getQuantNos(){
        return this.quantidade_de_nos;
    }
	
	public boolean retira(int cpf) {
		ListNode ponteiro, aux;
		aux = null;
		ponteiro = this.prim;
		while(ponteiro != null && ponteiro.getElem().getCpf() != cpf) {
			aux = ponteiro;
			ponteiro = ponteiro.getProx();
			}
		if(ponteiro == null) {
			//Caso ele não encontre o elemento na lista
			return false;
		}
		if(ponteiro.getProx() == null) {
			//Caso o elemento seja o ultimo
			this.ult = aux;
			ponteiro.setProx(null);
			this.quantidade_de_nos--;
			return true;
		}
		if(ponteiro == this.prim) {
			//Caso o elemento seja o primeiro
			this.prim = ponteiro.getProx();
			this.quantidade_de_nos--;
			return true;
		}
		//Caso geral
		aux.setProx(ponteiro.getProx());;
		this.quantidade_de_nos--;
		return true;
	}
}