public class Counter implements CounterInterface {

    private int incrementValue;
    private final String id;
    private int sum;


    public Counter(String id, int incrementValue){
        this.id = id;
        this.incrementValue = incrementValue;
    }

    public Counter(String id){
        this(id, Counter.defaultIncrementValue);
    }

    public String getId() {
        return id;
    }

    @Override
    public void increment() {
        this.sum += 1;
    }

    @Override
    public int tally() {
        return this.sum;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "incrementValue=" + incrementValue +
                ", id='" + id + '\'' +
                ", sum=" + sum +
                '}';
    }
}
