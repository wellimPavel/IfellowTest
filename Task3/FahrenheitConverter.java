package Task3;
public class FahrenheitConverter implements Converter{
    @Override
    public double getConverted(double baseValue) {
        return 1.8 * baseValue +32;
    }
}
