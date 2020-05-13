public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int auidenceCount;

    public Reservation() {
    }

    public Reservation(Customer customer, Screening screening, Money fee, int auidenceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.auidenceCount = auidenceCount;
    }
}