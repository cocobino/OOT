import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//판매원 -> 매표소 초대장을 티켓으로교환, 티켓을 판매하는 역할
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();
    
    public TicketOffice(Long amount, Ticket ...tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }
    
    //@ticketoffice 에서 내부적으로 처리할수있지만 audience 와 의존성이 생겼음
    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}