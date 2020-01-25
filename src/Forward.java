public class Forward extends Player {

    private double PPG;
    private double height;
    private double weight;
    private String name;

    public Forward(double PPG, double height, double weight, String name){
        this.PPG = PPG;
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPPG() {
        return this.PPG;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public void setPPG(double PPG) {
        this.PPG = PPG;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
