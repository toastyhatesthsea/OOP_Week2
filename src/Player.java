public abstract class Player {

    public abstract double getPPG();

    public abstract double getHeight();

    public abstract double getWeight();

    public abstract String getName();

    @Override
    public String toString(){
        return "Name: " +this.getName()+", PPG: "+this.getPPG()+", Height: "+this.getHeight()+", Weight: "+this.getWeight();
    }
}
