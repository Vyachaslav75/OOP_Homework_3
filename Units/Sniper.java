package Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y) {

        super(15, 12, 8, 10, 10, 9, name, x, y, 32);
    }

    public String getInfo(){
        return String.format("%s Arrows: %d", super.getInfo(), this.arrows);
    }

    public String getType(){return "Снайпер";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
