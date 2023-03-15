package Units;

import java.util.ArrayList;

public class Peasant extends BaseHero {
    private int delivery = 1;
//    public Peasant(int x, int y) {
//        super(String.format("Hero_Peasant #%d", ++Peasant.number), x, y);
//    }

    public Peasant(String name, int x, int y) {
        super(name, x, y);
    }

    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }

    public String getType(){return "Крестьянин";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
