public class NoneDiscountPolicy implements DefaultDiscountPolicy{
    //@할인조건이 없을경우 getDIscountAmount 를 실행할 필요가 없음   
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}