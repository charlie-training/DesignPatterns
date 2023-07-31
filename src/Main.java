import CreationalPattern.Builder.BuilderPattern;
import CreationalPattern.Builder.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new BuilderPattern().buildColour("blue").buildTopSpeed(110).carBuilder();
        Car car1 = new BuilderPattern().buildTopSpeed(140).carBuilder();
        System.out.println(car);
        System.out.println(car1);
    }
}