package TrabalhoPO;

public class Item {
    private long cpf;
    private long subscription;
    private float value;
    private boolean paid;

    

    public Item(long cpf, long subscription, float value, boolean paid) {
		super();
		this.cpf = cpf;
		this.subscription = subscription;
		this.value = value;
		this.paid = paid;
	}
    
    

	@Override
	public String toString() {				
		return this.cpf+";"+this.subscription+";"+this.value+";"+this.paid+";";
	}

	public long getCpf() {
        return cpf;
    }

    public long getSubscription() {
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