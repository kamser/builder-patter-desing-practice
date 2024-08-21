package carBuilder;

public interface Builder {
    public Builder setId(String id);

    public Builder setLine(String line);

    public Builder setColor(String color);

    public Builder setDoorsNumber(int doorsNumber);

    public Builder setWindowsNumber(int windowsNumber);

    public Builder setWheelsNumber(int wheelsNumber);

    public Builder setValue(double value);

    public Builder setSerialNumber(int serialNumber);

    public Builder setEngineType(String engineType);

    public Builder setFuelType(int fuelType);

    public Builder setHouseBrand(String houseBrand);

    public Builder setFullExtras(boolean fullExtras);
    public Car build();
}
