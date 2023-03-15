package Units;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    //private int arrows;
//    public Crossbowman(int x, int y) {
//
//        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number), x, y, 16);
//    }

    public Crossbowman(String name, int x, int y) {

        //super(name);
        super(10, 6, 2, 3, 3, 4, name, x, y, 16);
        //this.arrows = 16;
    }

    public String getInfo(){
        return String.format("%s Arrows: %d", super.getInfo(), this.arrows);
    }

    public String getType(){return "Арбалетчик";}

//    @Override
//    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
//
//        if (this.arrows > 0 && this.health > 0){
//            System.out.println("Могу стрелять!");
//            for (BaseHero hero : team){
//                if (hero.health > 0){
//                    this.getAttackOther(hero);
//                    this.arrows--;
//                    break;
//                }
//            }
//        }
//        System.out.println("Остаось стрел" + String.valueOf(this.arrows));
//        for (BaseHero hero : friends){
//            if (hero.getInfo().equals("Peasant")){
//                this.arrows++;
//                break;
//            }
//        }
//        System.out.println("Остаось стрел" + String.valueOf(this.arrows));
//    }
}
