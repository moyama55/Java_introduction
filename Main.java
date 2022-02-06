public class Main{
    public static void main(String[] args){
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました！");
        h.sit(5);
        h.slip();
        h.sit(25);
        h.run();

        Cleric c = new Cleric();
        c.name = "こうじ";
        c.selfAid();
        c.mp = 5;
        int heal =c.pray(5);
        System.out.println( heal + "分回復した" );
    }
}