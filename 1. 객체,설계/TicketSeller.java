//판매자는 TicketOffice 를 알고있어야함

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
        
        /*                          Theater 에서 Seller 에 직접접근을 막은거처럼 audience의 bag에 직접 접근을 막아야함 ->
                                    Audience에서 자체적으로 가방에서 꺼내 티켓을 Seller 에게 줘야함

        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketOffice.getTicket();

            audience.getBag().setTicket(ticket);
        } else {
            //초대장이 없는경우
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());

            audience.getBag().setTicket(ticket);
        }
        */
        
        /*                              @ seller 는 ticketOffice에 직접접근해서 자율권을 침해하고있음, ticketoffice 의 인터페이스에 의존하게 만들면됨
        //@Seller 는 Audience의 인터페이스에만 의존하면됨
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
        */
        ticketOffice.sellTicketTo(audience);
    }
}