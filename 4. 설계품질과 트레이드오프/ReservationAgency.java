// 데이터들을 가지고 영화 예매절차를 구현함
public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;
        // 할인가능여부를 파악
        for(DiscountCondition condition : movie.getDiscountConditions()) {
            discountable = screening.getWhenScreened().getDayOfWeek().equals(condition.getDayOfWeek()) &&
            condition.getStartTime().compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
            condition.getEnd().compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
        } else {
            discountable = condition.getSequence() == screening.getSequence();
        }

        if(discountable) {
            break;
        }
        
        
        //적용할 요금을 계산 
        Money fee;
        if(discountable) {
            Money discountAmount = Money.ZERO;
            switch(movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                break;
                case PERCENT_DISCOUNT:
                break;
                case NONE_DISCOUNT:
                break;
            }
            fee = movie.getFee().minus(discountAmount).times(audienceCount);
        } else {
            fee = movie.getFee();
        }
        
        return new Reservation(customer, screening, fee, audienceCOunt);
    }
}