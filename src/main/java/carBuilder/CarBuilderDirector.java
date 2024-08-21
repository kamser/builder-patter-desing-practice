package carBuilder;

public class CarBuilderDirector {
    public void createFerrariCar(Builder builder){
        builder.setId("212332")
                .setColor("RED")
                .setDoorsNumber(2)
                .setEngineType("V12")
                .setLine("Tesstarosa")
                .setFullExtras(true)
                .setFuelType(0)
                .setHouseBrand("La Ferrari")
                .setSerialNumber(1234346352)
                .setValue(4002000.99)
                .setWheelsNumber(4)
                .setWindowsNumber(8);
    }

    public void createPorsheCar(Builder builder){
        builder.setId("111111")
                .setColor("WHITE")
                .setDoorsNumber(5)
                .setEngineType("V8")
                .setLine("911")
                .setFullExtras(true)
                .setFuelType(1)
                .setHouseBrand("caiman")
                .setSerialNumber(323453234)
                .setValue(299999.99)
                .setWheelsNumber(5)
                .setWindowsNumber(10);
    }
}
