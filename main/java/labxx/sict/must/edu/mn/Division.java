package labxx.sict.must.edu.mn;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            // More descriptive message for hotfix
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
