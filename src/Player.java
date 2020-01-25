public abstract class Player {

    public abstract String getPPG();

    public abstract String getHeight();

    public abstract String getWeight();

    @Override
    public String toString(){
        return "RAM= "+this.getPPG()+", HDD="+this.getHeight()+", CPU="+this.getWeight();
    }
}
