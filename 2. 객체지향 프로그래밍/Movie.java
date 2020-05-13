import java.time.Duration;

//영화에대한 정보
//@Movie 내부에서 할인에대한 정보가지고있지 않음, 상속과 다형성을통해가능해짐
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        //@하나의 영화에대한 하나의 할인정책만 설정가능함, 조건은 여러개가능, DiscountPolicy는 여러개 를 받을수있음
        this.discountPolicy = discountPolicy;
    }
    
    public Money getFee() {
        return fee;
    }

    //discountPolicy 에 메세지를 전송해 할인 요금을 반환 받음
    //@ 어떤 할인 정책을 적용할건지 코드에 존재하지 않음 (상속, 다형성)이 숨어있음
    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}