import carBuilder.Car;
import carBuilder.CarBuilder;
import carBuilder.CarBuilderDirector;

public class Client {

    static public void main(String[]agrs){

        //This is the way to create an object with director helper
        CarBuilderDirector ferrariBuilderDirector = new CarBuilderDirector();
        CarBuilder ferrariBuilder = new CarBuilder();
        ferrariBuilderDirector.createFerrariCar(ferrariBuilder);
        Car ferrariTesstarosaCar = ferrariBuilder.build();
        ferrariTesstarosaCar.presentSpecs();

        //This is other way to crate an object with no director helper
        CarBuilder porsheBuilder =  new CarBuilder();

        Car porshe911Car = porsheBuilder.setId("111111")
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
                                        .setWindowsNumber(10)
                                        .build();

        porshe911Car.presentSpecs();
    }
}
