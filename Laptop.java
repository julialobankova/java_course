
public class Laptop {
    private String model;
    private String os;
    private String color;
    private String screenResolution;

    public Laptop(String model, String os, String color, String screenResolution) {
        this.model = model;
        this.os = os;
        this.color = color;
        this.screenResolution = screenResolution;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }
    public String getScreenResolution() {
        return screenResolution;
    }



}
