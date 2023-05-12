package day7;

public class Player {
    private int stamina;                            // ИСПРАВЛЕНО: заменен на private
    public static final int MAX_STAMINA=100;        // ИСПРАВЛЕНО: добавлен final
    public static final int MIN_STAMINA=0;          // ИСПРАВЛЕНО: добавлен final

    private static int countPlayers;                // ИСПРАВЛЕНО: заменен на private

    public Player(int stamina) {
        this.stamina = stamina;                     // ИСПРАВЛЕНО: вынесено перед IF
        if (countPlayers < 6) {
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
