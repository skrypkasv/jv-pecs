package core.mate.academy.model;

public class Truck extends Machine {
    private String name;
    private String color;
    private String model;
    private int axis;

    public Truck() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAxis() {
        return axis;
    }

    public void setAxis(int axis) {
        this.axis = axis;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
