
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        DecreasingCounter counterSecond = new DecreasingCounter(1);

        counter.printValue();
        counter.decrement();
        counter.printValue();
        counter.decrement();
        counter.printValue();
        counterSecond.printValue();
        counterSecond.decrement();
        counterSecond.printValue();
        counterSecond.decrement();
        counterSecond.printValue();
        counter.reset();
        counter.printValue();
    }
}
