import java.math.BigDecimal;

//Decimal 을 사용하면 금애관련로직, 금액에대한 의미를 담을수있음
//객체지향은 객체를 이용해 도메인의 의미를 풍부하게 표현가능


public class Money {
    public static final Money ZERO = Money.wons(0);
    private final BigDecimal amount;

    public static Money wons (long amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    public static Money wons(double amount) {
        return new Money(BigDecimal.valueOf(amount));
    }

    Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        return new Money(this.amount.add(amount.amount));
    }

    public Money minus(Money amount) {
        return new Money(this.amount.subtract(amount.amount));
    }

    public Money times(double percent) {
        return new Money(this.amount.multiply(
            BigDecimal.valueOf(percent)
        ));
    }

    public boolean isLessThan(Money other) {
        return amount.compareTo(other.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money other) {
        return amount.compareTo(other.amount) >= 0;
    }
}