package TrabalhoPO;

public class Hashmap{
    private List[] array;

    public Hashmap(int n){
        // n equals number of elements
        int m = n + 1;
        boolean canStop = false;
        while(!canStop){
            if(IsPrime(m)){
                canStop = true;
            }else{
                m++;
            }
        }
        this.array = new List[m];
    }

    private boolean IsPrime(int n){
        int i;
        if(n < 2){
            return false;
        }

        for(i = 2; i < n; i++){
            if(i % n == 0){
                return false;
            }
        }

        return true;
    }

    private int hashing(long key){
        return (int) (key%this.array.length);
    }

    public void insert(Item novo){
        int key = (int) hashing(novo.getCpf());
        if(array[key] == null) {
            array[key] = new List();
            array[key].insere_final(novo);
        } else{
            array[key].insere_final(novo);
        }
    }

    public Item search(long cpf){
        int chave = hashing(cpf);
        return pesquisaLinear(cpf , this.array[chave].getPrim());
    }

    public Item pesquisaLinear(long cpf, ListNode pesquisada) {

        if(pesquisada == null){
            return null;
        }
        if(cpf == pesquisada.getElem().getCpf()){
            return pesquisada.getElem();
        }else{
            return pesquisaLinear(cpf, pesquisada.getProx());
        }
    }
}

