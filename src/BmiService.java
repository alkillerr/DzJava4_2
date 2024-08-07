public class BmiService {
    public int calculate(int weightKilogram, double heightMeters) {
        double bmi;
        bmi = weightKilogram / Math.pow(heightMeters, 2);
        return (int) bmi;
    }
}
