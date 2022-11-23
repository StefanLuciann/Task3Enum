public class Main {
    public static void main(String[] args) {
        TemperatureConvert temperatureConvert = TemperatureConvert.C_K;
        TemperatureConvert.convertTemperature('c','f',25);
        System.out.println(TemperatureConvert.convertTemperature('c','f',25));

    }
}