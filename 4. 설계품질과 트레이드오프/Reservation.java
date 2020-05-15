
public class Reservation {
    private Customer Customer;
    private Screening screening;
    private Money fee;
    private int audienceCOunt;

    public Reservation(Customer Customer, Screening screening, Money fee, int audienceCOunt) {
        this.Customer = Customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCOunt = audienceCOunt;
    }

    public Customer getCustomer() {
        return this.Customer;
    }

    public void setCustomer(Customer Customer) {
        this.Customer = Customer;
    }

    public Screening getScreening() {
        return this.screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public Money getFee() {
        return this.fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCOunt() {
        return this.audienceCOunt;
    }

    public void setAudienceCOunt(int audienceCOunt) {
        this.audienceCOunt = audienceCOunt;
    }

    public Reservation Customer(Customer Customer) {
        this.Customer = Customer;
        return this;
    }

    public Reservation screening(Screening screening) {
        this.screening = screening;
        return this;
    }

    public Reservation fee(Money fee) {
        this.fee = fee;
        return this;
    }

    public Reservation audienceCOunt(int audienceCOunt) {
        this.audienceCOunt = audienceCOunt;
        return this;
    } 
}
