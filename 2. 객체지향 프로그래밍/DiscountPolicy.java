import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//DisCountCondition 을 인스턴스 변수로 가지고있음, 하나의 할인정책은 여러개의 할인조건을 포함하게됨
//@ NoneDiscountyPolicy에 서는 getDiscountAmount 가 어떤값으로 반환되어도 상관없음 해결이 필요함
// @ DiscountPolicy를 인터페이스로 변경후 NoneDiscountPolicy가 getDiscountAmount 메서드가아닌 calculateDiscountAmount오퍼레이션을 오버라이딩하면됨
public interface DefaultDiscountPolicy {
    /*
    private List<DiscountPolicy> conditions = new ArrayList<>();

    //@ 여러개의 조건들이가능함, 생성자 파라미터 목록을 이용해 초기 필요한 정보를 전달하도록 강제함
    public DiscountPolicy(DiscountPolicy ...condition) {
        this.conditions = Arrays.asList(condition);
    }

    //할인조건을 만족하면 추상메서드 getDiscountAmount 를 호출함
    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
    //만족하지 않으면 원가
        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening); //@요금계산은 추상메서드에 위임함
    */
    Money calculateDiscountAmount(Screening screening);
}

public abstract class DiscountPolicy implements DefaultDiscountPolicy {
    private List<DiscountPolicy> conditions = new ArrayList<>();

    //@ 여러개의 조건들이가능함, 생성자 파라미터 목록을 이용해 초기 필요한 정보를 전달하도록 강제함
    public DiscountPolicy(DiscountPolicy ...condition) {
        this.conditions = Arrays.asList(condition);
    }

    //할인조건을 만족하면 추상메서드 getDiscountAmount 를 호출함
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if(each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }
    //만족하지 않으면 원가
        return Money.ZERO;
    }
}