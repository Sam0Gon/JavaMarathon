package day7;

import static day7.Player.MIN_STAMINA;
import static day7.Player.info;

// вJOBывай и вJAVAвай
public class Task2 {
// Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
// который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента
// в конструктор случайно сгенерированные числа от 90 до 100. Вызвать метод info().
// При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
    public static void main(String[] args) {
        Player golkeeper = new Player((int)(Math.random()*10+90));
        Player defenderLeft = new Player((int)(Math.random()*10+90));
        Player defenderrRight = new Player((int)(Math.random()*10+90));
        Player insidLeft = new Player((int)(Math.random()*10+90));
        Player insudeRight = new Player((int)(Math.random()*10+90));
        Player forward = new Player((int)(Math.random()*10+90));
        info();
        //System.out.println("countPlayers "+Player.countPlayers);
        Player forwardFast = new Player((int)(Math.random()*10+90));
        Player arbitr = new Player((int)(Math.random()*10+90));
        //System.out.println("forward.stamina "+forward.stamina);
        while (forward.stamina > MIN_STAMINA){
            forward.run();
        }
        //System.out.println("forward.stamina "+forward.stamina);
//        if (forward.stamina <= MIN_STAMINA){
//            Player.countPlayers--;
//        }
        //System.out.println("countPlayers "+ Player.countPlayers);
        info();

    }
}
