package CarExercise;

/**
 * Created by micahdisney on 5/30/17.
 */
public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("CarExercise.setCurrentGear(): Change to " + currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("CarExercise.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
