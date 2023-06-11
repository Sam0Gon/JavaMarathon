package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Hero playr1 = new Hero("Warior", 100, 30, 0, 80, 0,0,0);
        Hero playr2 = new Hero("Paladin", 100, 15, 0,50,20,25,10);
        Hero playr3 = new Hero("Magician", 100, 5, 20,0,80,0,0);
        Hero playr4 = new Hero("Shaman", 100, 10, 15,20,20,50,30);

        playr1.physicalAttack(playr2);
        playr2.toString();
        playr2.physicalAttack(playr3);
        playr3.toString();
        playr4.healTeammate(playr3);
        playr3.toString();
        playr3.magicalAttack(playr2);
        playr2.toString();
        playr4.physicalAttack(playr1);
        playr1.toString();
        playr2.healHimself();
        playr2.toString();
        for (int i=0; i<5; i++) {
            playr1.physicalAttack(playr3);
            playr3.toString();
        }
    }
}
