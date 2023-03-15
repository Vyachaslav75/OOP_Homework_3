package Units;

import java.util.ArrayList;

public class Monk extends BaseHero {
    private int mana;
    private int manaMax;

//     public Monk(int mana, int manaMax) {
//        super(String.format("Hero_Monk #%d", ++Monk.number));
//        this.mana = manaMax;
//        this.manaMax = Monk.r.nextInt(100, 200);
//    }

    public Monk(String name, int x, int y) { //, int manaMax) {
        //super(name);
        super(30, 12, -4, -4, 7, 5, name, x, y);
        this.manaMax = 1;
        this.mana = manaMax;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }

    public String getType(){return "Монах";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
