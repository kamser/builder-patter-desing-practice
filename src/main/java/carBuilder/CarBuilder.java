package carBuilder;

public class CarBuilder implements Builder{

    private String id;
    private String line;
    private String color;
    private int doorsNumber;
    private int windowsNumber;
    private int wheelsNumber;
    private double value;
    private int serialNumber;
    private String engineType;
    private int fuelType;
    private String houseBrand;
    private boolean fullExtras;

    public CarBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CarBuilder setLine(String line) {
        this.line = line;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
        return this;
    }

    public CarBuilder setWindowsNumber(int windowsNumber) {
        this.windowsNumber = windowsNumber;
        return this;
    }

    public CarBuilder setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
        return this;
    }

    public CarBuilder setValue(double value) {
        this.value = value;
        return this;
    }

    public CarBuilder setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder setFuelType(int fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public CarBuilder setHouseBrand(String houseBrand) {
        this.houseBrand = houseBrand;
        return this;
    }

    public CarBuilder setFullExtras(boolean fullExtras) {
        this.fullExtras = fullExtras;
        return this;
    }

    @Override
    public Car build() {
        return new Car( id, line, color, doorsNumber, windowsNumber, wheelsNumber, value, serialNumber, engineType, fuelType, houseBrand, fullExtras);
    }
}
