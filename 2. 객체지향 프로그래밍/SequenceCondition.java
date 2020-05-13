//할인여부를 위해 순번을 부여함
public class SequenceCondition implements DisCountCondition{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}