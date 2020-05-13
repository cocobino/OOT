import java.time.LocalDateTime;

// 사용자들이 예매하는 대상인 '상영' 을 구현
// 인스턴스 private, 함수 public
// 외부에서 내부객체속성에 직접접근하면 안됨, public 함수를통해서만 접근
//@ 경계의 명확성이 `자율성`을 보장, 인터페이스와 구현분리가 되어야함

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screenning(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }    

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    //요금 계산 (관객수 * 영화티켓값)
    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    // 영화를 예매후 예매정보를 담고있음
    public Reservation reserve(Customer customer , int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

}