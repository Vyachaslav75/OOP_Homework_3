package Units;

import java.util.ArrayList;

public class Robber extends BaseHero {
//    public Robber(int health, int attack, int minDamage, int maxDamage, int armor, int speed, String name) {
//        super(health, attack, minDamage, maxDamage, armor, speed, name);
//    }

//    public Robber() {
//        super(String.format("Hero_Robber #%d", ++Robber.number));
//    }

    public Robber(String name, int x, int y) {

        //super(name)
        super(10, 8, 2, 4, 3, 6, name, x, y);;
    }

    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }

    public String getType(){return "Разбойник";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
