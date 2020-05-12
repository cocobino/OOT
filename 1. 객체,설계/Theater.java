//@ Theater 에서 너무많은 정보를 가지고 있어야 함, Audience TicketSeller 변경시 Theater도 같이 변경되어야함
//@ Theater 입장에선 Auidence, TicketSeller 의 세세한 부분까지 알필요가 없음, 각각 주체적으로 일하게 해야함, Theater 는 단지 입장하는 역할만
//@ 관람객이 스스로 현금,초대장 처리 || 판매원이 스스로 매표소의 티켓 판매요금 처리
public class Theater {
    private TicketSeller ticketSeller;
    
    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter (Audience audience) {
        /*                                TicketOffice 에 접근하는 모든 코드를 TicketSeller 에게 옮김, Seller가 주체적으로 일함
        //초대장이 있는경우
        if(audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();

            //@소극장이 가방을 함부러 열어보는 문제
            audience.getBag().setTicket(ticket);
        } else {
            //초대장이 없는경우
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            //@소극장이 마음대로 돈을 사용 하는 문제
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());

            audience.getBag().setTicket(ticket);
        }
        */
        ticketSeller.sellTo(audience); // ticketOffice 에 직접접근하지않음, 
    }
}