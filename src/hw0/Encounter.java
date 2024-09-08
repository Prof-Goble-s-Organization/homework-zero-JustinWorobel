package hw0;

public class Encounter extends SpaceAlien implements ZapsWithSlime{
    private int humans;
    private int aggression;



   
    public Encounter(int human, int aggress, String planet, double dist){
        super(planet, dist);
        aggression = aggress;
        humans = human;
    }

    public int getHuman(){
        return humans;
    }

    public int getAggress(){
        return aggression;
    }


    //Override 
    public void doGreeting(Encounter enc){
        System.out.println("I am from" + getPlanet() + "which is" + getDist() + "from Earth");
    }

    public String doSlimeZap(int human){
        if(human <= 10){
            return "pew";
        }else if(human <= 50){
            return "ZORP";
        }else{
            return "BLECH";
        }
    }
    public String slimeWholeEarth(){
        return "squish";
    }

    public static void main(String[] args){
        Encounter alienSeen = new Encounter(15, 7, "Pebble", 2);

        alienSeen.doGreeting();
        alienSeen.doSlimeZap(alienSeen.getHuman());

        if(alienSeen.getAggress() > 5){

            alienSeen.slimeWholeEarth();
        }

    }
}
