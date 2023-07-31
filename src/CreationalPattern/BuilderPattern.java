package CreationalPattern;

public class BuilderPattern {

    private String passColour;

    private int topSpeed;

    public BuilderPattern() {
        System.out.println("Created builder...");
    }

    public Car carBuilder() {
        System.out.println("Created car...");
        return new Car(passColour, topSpeed);
    }

    public BuilderPattern buildColour(String passColour) {
        this.passColour = passColour;
        return this;
    }

    public BuilderPattern buildTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
        return this;
    }

}
