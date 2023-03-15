package Units;

import java.util.ArrayList;

public class Spearman extends BaseHero {
//    public Spearman() {
//        super(String.format("Hero_Spearman #%d", ++Spearman.number));
//    }

    public Spearman(String name, int x, int y) {

        //super(name);
        super(10, 4, 1, 3, 5, 4, name, x, y);
    }

    public String getInfo(){
        return String.format("%s ", super.getInfo());
    }

    public String getType(){return "Копейщик";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
