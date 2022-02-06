public class Hero{
    String name;
    int hp;
    Sword sword;
    public void attack() {
        System.out.println(this.name + this.sword.name + "で攻撃した！");
    }
    public void sleep() {  
        this.hp = 100;
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "は、" + sec + "秒座った！");
    }
    public void slip() {
       this.hp -= 5;
       System.out.println(this.name + "は、転んだ！"); 
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}