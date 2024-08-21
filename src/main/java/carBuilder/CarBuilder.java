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

    public void setId(String id) {
        this.id = id;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public void setWindowsNumber(int windowsNumber) {
        this.windowsNumber = windowsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public void setHouseBrand(String houseBrand) {
        this.houseBrand = houseBrand;
    }

    public void setFullExtras(boolean fullExtras) {
        this.fullExtras = fullExtras;
    }

    @Override
    public Car build() {
        return new Car( id, line, color, doorsNumber, windowsNumber, wheelsNumber, value, serialNumber, engineType, fuelType, houseBrand, fullExtras);
    }
}
