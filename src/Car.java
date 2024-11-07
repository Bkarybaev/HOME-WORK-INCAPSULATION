public class Car {
    private String model;
    private int speed;
    private double volume;

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void getInfo(){
        System.out.printf("""
                Model car : %s
                Speed car : %s
                Volume    : %f
                """,model,speed,volume);
    }
}
