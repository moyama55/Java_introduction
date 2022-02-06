public class PoisonMatango extends Matango {
    int posionAttack = 5;
    public PoisonMatango(char suffix){
        super(suffix);
    }
    public void attack(Hero h){
        super.attack(h);
        if(this.posionAttack > 0){
            System.out.println("追加攻撃");
            int dmg = h.hp / 5;
            System.out.println(dmg + "ポイントのダメージ");
            this.posionAttack -= 1;
            aaa
        }

    }
}
