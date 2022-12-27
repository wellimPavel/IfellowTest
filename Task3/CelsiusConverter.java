package Task3;
class CelsiusConverter implements Converter {
    @Override
    public double getConverted(double baseValue) {
        return baseValue;
    }
    private double temperature;
    public CelsiusConverter(double temperature) {
        this.temperature = temperature;
    }
    public void getInfo() {
        System.out.println("Температура по Цельсию: " + getConverted(temperature));
        System.out.println("Температура по Кельвину: " + new KelvinConverter().getConverted(temperature));
        System.out.println("Температура по Фаренгейту: " + new FahrenheitConverter().getConverted(temperature));
    }
}

