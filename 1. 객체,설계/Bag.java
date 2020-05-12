// 관람객이 소지할 Bag
public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;
    
    // 관람객은 초대장/현금 보관중
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        //@ Audience 에서 bag에 직접접근하지 않게됨
        if(hasInvitation()) {
            setTicket(ticket);;
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    //초대장 여부 판단
    public boolean hasInvitation() {
        return invitation != null;
    }

    //티켓 소유 판단
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amont) {
        this.amount += amont;
    }
}