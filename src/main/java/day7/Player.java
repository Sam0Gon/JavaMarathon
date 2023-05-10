package day7;

public class Player {
    public int stamina;
    public static int MAX_STAMINA=100;
    public static int MIN_STAMINA=0
            ;
    public static int countPlayers;
    public Player(int stamina){
        if (countPlayers< 6) {
            this.stamina = stamina;
            countPlayers++;
//            System.out.println("countPlayers "+countPlayers);
//            info();
        }
        //else info();
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    public void run(){
        if (this.stamina != 0) {
            if (this.stamina > 0) this.stamina--;
            if (this.stamina == 0) countPlayers--;
        }
    }
    public static void info(){
        if (countPlayers<6)
            System.out.println("Команды неполные. На поле еще есть "+ (6-countPlayers)+" свободных мест");
        else System.out.println("На поле нет свободных мест");
    }
}
