package day6;
// вJOBывай и вJAVAвай
public class Task1 {
    // В классах Автомобиль и Мотоцикл реализуйте два метода:
    // void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
    // int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
    // и возвращает разницу между переданным годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).
    // Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот,
    // должно быть возвращено одно и тоже положительное число 10. Такого понятия как “некорректный ввод” или любое другое сигнализирующее об ошибке, здесь быть не может
    //
    // В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
    public static void main(String[] args) {
        Car mashina = new Car();
        mashina.setModel("ZAZ Tavriya");
        mashina.setColor("braun");
        mashina.setYear(1980);
        mashina.info();
        System.out.println(mashina.yearDifference(2023));
        Motorbike newmoto = new Motorbike("CZ","orange",1996);
        newmoto.info();
        System.out.println(newmoto.yearDifference(2020));
    }
}
