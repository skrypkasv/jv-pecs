package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String name;
    private String color;
    private String mover;
    private int wide;

    public Bulldozer() {
    }

    public String getMover() {
        return mover;
    }

    public void setMover(String mover) {
        this.mover = mover;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
