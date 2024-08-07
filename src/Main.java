public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilogram = 98; //масса
        double heightMeters = 1.87; //рост
        int index = service.calculate(weightKilogram, heightMeters);
        System.out.println("индекс массы тела: " + index + " кг/м^2");
    }
}