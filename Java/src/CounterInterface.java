public interface CounterInterface {

    public static int defaultIncrementValue = 1;
    int tally();
    void increment();
    String toString();
}