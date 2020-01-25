public class PlayerFactoryThing {

    public Player getPlayer(String type, double ppg, double height, double weight, String name){
        if ("Guard".equalsIgnoreCase(type)) {

            return new Guard(ppg, height, weight, name);
        } else if ("Forward".equalsIgnoreCase(type)) return new Forward(ppg, height, weight, name);

        return null;
    }
}

class Testers {
    public static void main(String[] asdasdasdsa) {

        PlayerFactoryThing thingMaker = new PlayerFactoryThing();

        Player aGuard = thingMaker.getPlayer("Guard", 20, 6.0, 200, "Super Baller");
        Player aForward = thingMaker.getPlayer("Forward", 16, 6.6, 250, "Steph Curry");

        System.out.println("\n\n------------------------------PLAYERS-------------------------------------------");
        System.out.println("Forward: " + aForward);
        System.out.println("\nGuard: " + aGuard);
        System.out.println("-------------------------------------------------------------------------\n\n");

    }
}