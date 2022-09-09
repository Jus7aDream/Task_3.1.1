package web.model;
public class Car {

    private int year;
    private String model;
    private int type;

    public Car() {
    }

    public Car(int year, String model, int type) {
        this.year = year;
        this.model = model;
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
