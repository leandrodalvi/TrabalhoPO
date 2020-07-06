package TrabalhoPO;

public class ABB {

	public ABBNode raiz;
	private int quantNos;

	public ABB() {
		this.raiz = null;
		this.quantNos = 0;
	}

	public ABBNode getRaiz() {
		return raiz;
	}

	public int getQuantNos() {
		return quantNos;
	}


	public boolean eVazia (ABBNode raiz){
		return(raiz == null);
	}

	public void inserir(ABBNode novo, ABBNode raiz) {
		if(eVazia(raiz)) {
			this.raiz = novo;
			return;
		}

		if(novo.getInfo().getCpf() < raiz.getInfo().getCpf()) {
			if(raiz.getEsq() == null) {
				raiz.setEsq(novo);
				this.quantNos++;
			}else {
				inserir(novo, raiz.getEsq());
			}
		}
		if(novo.getInfo().getCpf() > raiz.getInfo().getCpf()) {
			if (raiz.getDir() == null) {
				raiz.setDir(novo);
			} else {
				inserir(novo, raiz.getDir());
				this.quantNos++;
			}
		}
	}

	public Item search(long cpf) {
		return search(cpf, this.raiz);
	}

	public Item search(long cpf, ABBNode raiz) {

		if(eVazia(raiz)) {
			return null;
		}

		if(cpf == raiz.getInfo().getCpf()) {
			return raiz.getInfo();
		}

		if(cpf < raiz.getInfo().getCpf()) {
			return search(cpf, raiz.getEsq());
		}

		if(cpf > raiz.getInfo().getCpf()) {
			return search(cpf, raiz.getDir());
		}

		return null;
	}
	
	public void balancear(Item[] sortedArray) {
		
		ABB temp = new ABB();
		this.balancear(sortedArray, temp, 0 , sortedArray.length - 1);	
	}

	private void balancear(Item[] sortedArray, ABB temp, int start, int end) {

		if(end >= start) {
			int meio = (start+end)/2;
			temp.inserir(new ABBNode(sortedArray[meio]), temp.getRaiz());
			this.balancear(sortedArray, temp , start, meio -1);
			this.balancear(sortedArray, temp , meio + 1, end);
		}

		this.raiz = temp.raiz;
	}

}