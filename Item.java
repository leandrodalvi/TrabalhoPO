package TrabalhoPO;

public class Item {
    private int cpf;
    private int subscription;
    private float value;
    private boolean paid;

    //getBlock

    public int getCpf() {
        return cpf;
    }

    public int getSubscription() {
        return subscription;
    }

    public float getValue() {
        return value;
    }
    
    public boolean getPaid(){
        return paid;
    }

    //SetBlock

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setSubscription(int subscription) {
        this.subscription = subscription;
    }

    public void setValue(float value) {
        this.value = value;
    }

}