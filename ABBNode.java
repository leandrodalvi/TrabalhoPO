package TrabalhoPO;

public class ABBNode {
    private ABBNode esq;
	private ABBNode dir;
	private Item info;
	
	public ABBNode(Item novo) {
		this.info = novo;
		this.dir = this.esq = null;
	}	
	
	public ABBNode getEsq() {
		return esq;
    }
    
	public void setEsq(ABBNode esq) {
		this.esq = esq;
    }
    
	public ABBNode getDir() {
		return dir;
    }
    
	public void setDir(ABBNode dir) {
		this.dir = dir;
    }
    
	public Item getInfo() {
		return info;
    }
    
	public void setInfo(Item info) {
		this.info = info;
    }
    
}