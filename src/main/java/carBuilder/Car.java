package carBuilder;

import javax.swing.*;

public class Car implements Vehicle{
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

    protected Car(String id, String line, String color, int doorsNumber, int windowsNumber, int wheelsNumber, double value, int serialNumber, String engineType, int fuelType, String houseBrand, boolean fullExtras) {
        this.id = id;
        this.line = line;
        this.color = color;
        this.doorsNumber = doorsNumber;
        this.windowsNumber = windowsNumber;
        this.wheelsNumber = wheelsNumber;
        this.value = value;
        this.serialNumber = serialNumber;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.houseBrand = houseBrand;
        this.fullExtras = fullExtras;
    }

    @Override
    public void igniteEngine() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void goBackward() {

    }

    @Override
    public void moveForward() {

    }

    @Override
    public void turnOffEngine() {

    }

    @Override
    public void presentSpecs() {
        StringBuilder carSpecifications = new StringBuilder();
        carSpecifications.append("\n- Name: " + houseBrand)
                .append("\n- id: " + id)
                .append("\n- line: " + line)
                .append("\n- color: " + color)
                .append("\n- Doors Number: " + doorsNumber)
                .append("\n- Windows Number: " + windowsNumber)
                .append("\n- Wheels Number: " + wheelsNumber)
                .append("\n- Value: " + value)
                .append("\n- Engine Type: " + engineType);
        JOptionPane.showMessageDialog(null, carSpecifications.toString() ,"Car Spects", JOptionPane.INFORMATION_MESSAGE);
    }
}
