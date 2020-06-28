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
		if(novo.getInfo().getCpf() >= raiz.getInfo().getCpf()) {
			if(raiz.getDir() == null) {
				raiz.setDir(novo);
			}else {
				inserir(novo, raiz.getDir());
				this.quantNos++;
			}
		}
	}
}