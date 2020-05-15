import java.time.Duration;
import java.util.List;


public class Movie {
    private String title;
    private Duration ruunningTime;
    private Money fee;
    private List<DiscountCondition> discountConditions; //@데이터 중심설계시 할인조건의 목록이 Movie 안에 들어오게 된다.

    private MoveType movieType;
    private Money discountAmout;
    private double discountPercent;

    public Movie(String title, Duration ruunningTime, Money fee, List<DiscountCondition> discountConditions, MoveType movieType, Money discountAmout, double discountPercent) {
        this.title = title;
        this.ruunningTime = ruunningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
        this.movieType = movieType;
        this.discountAmout = discountAmout;
        this.discountPercent = discountPercent;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getRuunningTime() {
        return this.ruunningTime;
    }

    public void setRuunningTime(Duration ruunningTime) {
        this.ruunningTime = ruunningTime;
    }

    public Money getFee() {
        return this.fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return this.discountConditions;
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public MoveType getMovieType() {
        return this.movieType;
    }

    public void setMovieType(MoveType movieType) {
        this.movieType = movieType;
    }

    public Money getDiscountAmout() {
        return this.discountAmout;
    }

    public void setDiscountAmout(Money discountAmout) {
        this.discountAmout = discountAmout;
    }

    public double getDiscountPercent() {
        return this.discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Movie title(String title) {
        this.title = title;
        return this;
    }

    public Movie ruunningTime(Duration ruunningTime) {
        this.ruunningTime = ruunningTime;
        return this;
    }

    public Movie fee(Money fee) {
        this.fee = fee;
        return this;
    }

    public Movie discountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
        return this;
    }

    public Movie movieType(MoveType movieType) {
        this.movieType = movieType;
        return this;
    }

    public Movie discountAmout(Money discountAmout) {
        this.discountAmout = discountAmout;
        return this;
    }

    public Movie discountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }
}