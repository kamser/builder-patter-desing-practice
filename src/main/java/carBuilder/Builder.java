package carBuilder;

public interface Builder {
    public void setId(String id);

    public void setLine(String line);

    public void setColor(String color);

    public void setDoorsNumber(int doorsNumber);

    public void setWindowsNumber(int windowsNumber);

    public void setWheelsNumber(int wheelsNumber);

    public void setValue(double value);

    public void setSerialNumber(int serialNumber);

    public void setEngineType(String engineType);

    public void setFuelType(int fuelType);

    public void setHouseBrand(String houseBrand);

    public void setFullExtras(boolean fullExtras);
    public Car build();
}
