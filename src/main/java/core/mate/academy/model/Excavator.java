package core.mate.academy.model;

public class Excavator extends Machine {
    private String name;
    private String color;
    private String type;
    private int maxDeep;

    public Excavator() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxDeep() {
        return maxDeep;
    }

    public void setMaxDeep(int maxDeep) {
        this.maxDeep = maxDeep;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
