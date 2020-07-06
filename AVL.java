package TrabalhoPO;

public class AVL {
    private AVLNode raiz;
    private boolean h;

    public AVL() {
        this.raiz = null;
        this.h = true;
    }

    public AVLNode getRaiz() {
        return raiz;
    }

    public void insereRaiz(Item elem) {
        this.raiz = this.insert(elem, this.raiz);
    }

    public Item search(long cpf) {
        return search(cpf, this.raiz);
    }

    public Item search(long cpf, AVLNode raiz) {

        if(raiz == null) {
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

    public AVLNode insert(Item elem, AVLNode no) {
        if (no == null) {
            AVLNode novo = new AVLNode(elem);
            this.h = true;
            return novo;
        } else {
            if (elem.getCpf() < no.getInfo().getCpf()) {
                no.setEsq(this.insert(elem, no.getEsq()));
                no = this.balancearDir(no);
                return no;
            } else {
                no.setDir(this.insert(elem, no.getDir()));
                no = this.balancearEsq(no);
                return no;
            }
        }
    }

    private AVLNode balancearEsq(AVLNode no) {
        if (this.h)
            switch (no.getFatorBalanceamento()) {
                case -1:
                    no.setFatorBalanceamento((byte) 0);
                    this.h = false;
                    break;
                case 0:
                    no.setFatorBalanceamento((byte) 1);
                    break;
                case 1:
                    no = this.rotacaoEsquerda(no);
            }
        return no;
    }

    private AVLNode balancearDir(AVLNode no) {
        if (this.h)
            switch (no.getFatorBalanceamento()) {
                case 1:
                    no.setFatorBalanceamento((byte) 0);
                    this.h = false;
                    break;
                case 0:
                    no.setFatorBalanceamento((byte) -1);
                    break;
                case -1:
                    no = this.rotacaoDireita(no);
            }
        return no;
    }

    private AVLNode rotacaoDireita(AVLNode no) {
        AVLNode temp1, temp2;
        temp1 = no.getEsq();
        if (temp1.getFatorBalanceamento() == -1) {
            no.setEsq(temp1.getDir());
            temp1.setDir(no);
            no.setFatorBalanceamento((byte) 0);
            no = temp1;
        } else {
            temp2 = temp1.getDir();
            temp1.setDir(temp2.getEsq());
            temp2.setEsq(temp1);
            no.setEsq(temp2.getDir());
            temp2.setDir(no);
            if (temp2.getFatorBalanceamento() == -1)
                no.setFatorBalanceamento((byte) 1);
            else
                no.setFatorBalanceamento((byte) 0);
            if (temp2.getFatorBalanceamento() == 1)
                temp1.setFatorBalanceamento((byte) -1);
            else
                temp1.setFatorBalanceamento((byte) 0);
            no = temp2;
        }
        no.setFatorBalanceamento((byte) 0);
        this.h = false;
        return no;
    }

    private AVLNode rotacaoEsquerda(AVLNode no) {
        AVLNode temp1, temp2;
        temp1 = no.getDir();
        if (temp1.getFatorBalanceamento() == 1) {
            no.setDir(temp1.getEsq());
            temp1.setEsq(no);
            no.setFatorBalanceamento((byte) 0);
            no = temp1;
        } else {
            temp2 = temp1.getEsq();
            temp1.setEsq(temp2.getDir());
            temp2.setDir(temp1);
            no.setDir(temp2.getEsq());
            temp2.setEsq(no);
            if (temp2.getFatorBalanceamento() == 1)
                no.setFatorBalanceamento((byte) -1);
            else
                no.setFatorBalanceamento((byte) 0);
            if (temp2.getFatorBalanceamento() == -1)
                temp1.setFatorBalanceamento((byte) 1);
            else
                temp1.setFatorBalanceamento((byte) 0);
            no = temp2;
        }
        no.setFatorBalanceamento((byte) 0);
        h = false;
        return no;
    }
}