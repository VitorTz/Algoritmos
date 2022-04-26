public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter("c1");
        c.increment();
        System.out.println(c.tally());
    }
}
