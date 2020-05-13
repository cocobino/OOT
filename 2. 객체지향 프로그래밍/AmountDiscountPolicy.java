// AmountDiscountPolicy는 Discount 의 자식 클래스, 할인조건을 만족할 경우 일정금액을 한일해주는 정책을 구현함
public class AmountDiscountPolicy extends DiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition ...conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmout(Screening screening) {
        return discountAmount;
    }
}