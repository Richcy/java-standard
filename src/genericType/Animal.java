package genericType;

public class Animal {
    private String name;
    private String color;
    private int foot;

    public Animal(String name, String color, int foot) {
        this.name = name;
        this.color = color;
        this.foot = foot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFoot() {
        return foot;
    }

    public void setFoot(int foot) {
        this.foot = foot;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", foot=" + foot +
                '}';
    }
}
