package Units;

import java.util.ArrayList;

public class Wizard extends BaseHero {
    private int mana;
    private int maxMana;

//    public Wizard(int mana, int maxMana) {
//        super(String.format("Hero_Wizard #%d", ++Wizard.number));
//        this.maxMana = Wizard.r.nextInt(50, 150);
//        this.mana = maxMana;
//    }

    public Wizard(String name, int x, int y){ //, int maxMana) {
        //super(name);
        super(30, 17, -5, -5, 12, 9, name, x, y);
        this.maxMana = 1;
        this.mana = maxMana;
    }

    public String getInfo(){
        return String.format("%s Mana: %d", super.getInfo(), this.mana);
    }

    public String getType(){return "Колдун";}
//    @Override
//    public void step(ArrayList<BaseHero> team1) {
//        System.out.println("Могу ходить");
//    }
}
