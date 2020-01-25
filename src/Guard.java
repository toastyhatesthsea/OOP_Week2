public class Guard extends Player {

    private String PPG;
    private String height;
    private String weight;

    public Guard(String PPG, String height, String weight){
        this.PPG = PPG;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String getPPG() {
        return this.PPG;
    }

    @Override
    public String getHeight() {
        return this.height;
    }

    @Override
    public String getWeight() {
        return this.weight;
    }
}
