package TrabalhoPO;

public class AVLNode {
    private Item info;
    private AVLNode esq, dir;
    private byte fatorBalanceamento;

    public AVLNode (Item i){
        this.info = i;
        this.fatorBalanceamento = 0;
    }

    public AVLNode getDir() {
        return this.dir;
    }

    public void setDir(AVLNode dir) {
        this.dir = dir;
    }

    public AVLNode getEsq() {
        return this.esq;
    }

    public void setEsq(AVLNode esq) {
        this.esq = esq;
    }

    public byte getFatorBalanceamento() {
        return this.fatorBalanceamento;
    }

    public void setFatorBalanceamento(byte fatorBalanceamento) {
        this.fatorBalanceamento = fatorBalanceamento;
    }

    public Item getInfo() {
        return this.info;
    }
}