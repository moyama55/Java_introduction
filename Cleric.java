public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;
    
    public void selfAid(){
        this.hp = MAX_HP;
        System.out.println(this.name + "のライフは全回復した");
    }

    public int pray(int time){
        int heal;
        int random = new java.util.Random().nextInt(2); 
        if (this.mp != MAX_MP) {
            heal = time + random;
            this.mp = this.mp + heal;
        }else{
            heal = 0;
            this.mp = this.mp + heal;
        }          
        return heal;
    }
}
