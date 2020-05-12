// 관람객이라는 개념
//@ Auidence 는 자신의 가방에 초대장이 있는지 스스로 확인해야함
//@ 외부에서는 Audience 가 bag 소유하고 있다는 사실을 알릴피룡가 없음
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
            //초대장이 있는경우
        /*                     audience 에서 bag에 직접 관여하지않아도됨
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);

            return 0L;
        } else {
            //초대장이 없는경우
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            bag.setTicket(ticket);

            return ticket.getFee();
        }
        */
        return bag.hold(ticket)
    }
}