
public class Statistics {

    private int count;
    private int sum;

    // The constructor initializes the variables
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    // This method is called for each new number
    public void addNumber(int number) {
        this.count++;          // Increment the count of numbers
        this.sum = this.sum + number; // Add the number to the sum
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        // Avoid dividing by zero if no numbers have been added
        if (this.count == 0) {
            return 0;
        }
        // Cast the sum to a double to get an accurate decimal average
        return (double) this.sum / this.count;
    }
}
